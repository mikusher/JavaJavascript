/*
 * Copyright (C) 2017 Luis Tavares
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.agenda.classe.sqlClass;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

import cv.mikusher.agenda.classe.LoggOperation;
import java.util.logging.Level;





/**
 *
 * @author Luis Amilcar Tavares
 */
public class ConnectionToSQL implements ConstantesSQL, QueryOperation {

    private static Connection conn = null;





    public static Connection connect(String connectionType) {

        try {
            if (Objects.equals(connectionType, "lite".toLowerCase()
                                                     .trim())) {
                conn = DriverManager.getConnection(SQLLite);
                LoggOperation.LOGGER.log(Level.INFO, "Connection to {0} has been established.", connectionType);
            } else if (Objects.equals(connectionType, "psql".toLowerCase()
                                                            .trim())) {
                conn = DriverManager.getConnection(POSTGRES, pUser, pPassword);
                LoggOperation.LOGGER.log(Level.INFO, "Connection to {0} has been established.", connectionType);
            } else {
                System.err.println("Error to connect to " + connectionType);
            }
        } catch (SQLException e) {
            LoggOperation.LOGGER.warning(e.getMessage());
        }
        return conn;
    }





    public boolean loginCheck(String username, String password) {

        String dbUsername, dbPassword;
        boolean login = false;

        try {
            Class.forName("org.postgresql.Driver")
                 .newInstance();
            conn = DriverManager.getConnection(POSTGRES, pUser, pPassword);
            Statement stmt = conn.createStatement();
            stmt.executeQuery(queryUSERS);
            ResultSet resultS = stmt.getResultSet();
            while (resultS.next()) {
                dbUsername = resultS.getString("users_name");
                dbPassword = resultS.getString("users_password");
                if (dbUsername.equalsIgnoreCase(username) && dbPassword.equals(password)) {
                    login = true;
                    LoggOperation.LOGGER.info("Connection Done");
                } else {
                    LoggOperation.LOGGER.warning("Fail connection");
                }
            }
        } catch (InstantiationException | IllegalAccessException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return login;
    }
}

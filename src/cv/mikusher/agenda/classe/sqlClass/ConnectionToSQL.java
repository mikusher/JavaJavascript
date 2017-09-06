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

import cv.mikusher.agenda.classe.LoggOperation;





/**
 *
 * @author Luis Amilcar Tavares
 */
public class ConnectionToSQL implements ConstantesSQL, QueryOperation {

    static Connection conn = null;





    public static Connection connect(String connectionType) {

        try {
            if (connectionType == "lite".toLowerCase()
                                        .toString()
                                        .trim()) {
                conn = DriverManager.getConnection(SQLLite);
                LoggOperation.LOGGER.info("Connection to " + connectionType + " has been established.");
            } else if (connectionType == "psql".toLowerCase()
                                               .toString()
                                               .trim()) {
                conn = DriverManager.getConnection(POSTGRES, pUser, pPassword);
                LoggOperation.LOGGER.info("Connection to " + connectionType + " has been established.");
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
            Statement stmt = (Statement) conn.createStatement();
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
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return login;
    }
}

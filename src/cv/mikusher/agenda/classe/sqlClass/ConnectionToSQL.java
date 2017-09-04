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
import java.sql.SQLException;

import cv.mikusher.agenda.classe.LoggOperation;





/**
 *
 * @author Luis Amilcar Tavares
 */
public class ConnectionToSQL implements ConstantesSQL {

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
}

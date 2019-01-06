/*
 * Copyright (C) 2017 Luis Tavares
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.bockdamm.connsecurity;





import cv.bockdamm.utils.LoggOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;





public class Connectionsql implements Queryoperation {

    private static Connection conn = null;





    public static Connection connect(String connectionType) {

        try {
            if (Objects.equals(connectionType, "sqlite")) {
                conn = DriverManager.getConnection(SQLITE);
                LoggOperation.LOGGER.log(Level.INFO, "Connection has been established.");
            } else if (Objects.equals(connectionType, "psql")) {
                conn = DriverManager.getConnection(postgresconnection, postgresuser, postgrespassword);
                LoggOperation.LOGGER.log(Level.INFO, "Connection has been established.");
            } else {
                LoggOperation.LOGGER.log(Level.INFO, "Error in connection");
            }
        } catch (SQLException e) {
            LoggOperation.LOGGER.warning(e.getMessage());
        }
        return conn;
    }

}

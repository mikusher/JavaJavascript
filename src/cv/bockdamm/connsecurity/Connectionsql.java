/*
 * Copyright (C) 2017 Luis Tavares
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */
package cv.bockdamm.connsecurity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

import cv.bockdamm.utils.LoggOperation;

public class Connectionsql implements Queryoperation {

    private static Connection conn = null;

    public static Connection connect() {

        try {
            conn = DriverManager.getConnection(postgresconnection, postgresuser, postgrespassword);
            LoggOperation.LOGGER.log(Level.INFO, "Connection has been established.");
        } catch (SQLException e) {
            LoggOperation.LOGGER.warning(e.getMessage());
        }
        return conn;
    }

}

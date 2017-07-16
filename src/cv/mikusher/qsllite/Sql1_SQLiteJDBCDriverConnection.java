/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * D:\sqlite-jdbc-3.8.11.2.jar
 */





package cv.mikusher.qsllite;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





/**
 *
 * @author Miky Mikusher Wayne
 */
public class Sql1_SQLiteJDBCDriverConnection {

    public static void connect() {

        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:src/cv/mikusher/qsllite/BaseDados/Agenda.s3db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }





    public static void main(String[] args) {

        connect();
    }

}

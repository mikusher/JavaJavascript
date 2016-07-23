/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * D:\sqlite-jdbc-3.8.11.2.jar
 */
package cv.mikusher.qsllite;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Sql2_CreateDataBase {
 
    /**
     * Connect to a sample database
     *
     * @param fileName the database file name
     */
    public static void createNewDatabase(String fileName) {
 
        String url = "jdbc:sqlite:D:/SqlLiteData/" +fileName;
 
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("O Drive usado é " + meta.getDriverName());
                System.out.println("Base de dados " +fileName+ " criado com sucesso.");
            }
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createNewDatabase("Agenda.s3db");
    }
}
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
public class Sql_Version {

    static Connection conn      = null;
    static String     mUser     = "root";
    static String     mPassword = "vertrigo";
    static String     pUser     = "postgres";
    static String     pPassword = "postgres";

    static String     sqlLite   = "jdbc:sqlite:src/cv/mikusher/qsllite/BaseDados/Agenda.s3db";
    static String     mySql     = "jdbc:mysql://127.0.0.1:3306/testdb?useSSL=false";
    static String     postgres  = "jdbc:postgresql://127.0.0.1:5432/testdb";





    public static void connect(String myConnection) {

        try {

            if (myConnection == "lite".toString()
                                      .trim()) {

                conn = DriverManager.getConnection(sqlLite);
                System.out.println("Connection to " + myConnection + " has been established.");
            } else if (myConnection == "msql".toString()
                                             .trim()) {
                conn = DriverManager.getConnection(mySql, mUser, mPassword);
                System.out.println("Connection to " + myConnection + " has been established.");
            } else if (myConnection == "psql".toString()
                                             .trim()) {
                conn = DriverManager.getConnection(postgres, pUser, pPassword);
                System.out.println("Connection to " + myConnection + " has been established.");
            } else {
                System.err.println("Error to connect to " + myConnection);
            }

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

        connect("lite");
        connect("msql");
        connect("psql");
        connect("other");

    }

}

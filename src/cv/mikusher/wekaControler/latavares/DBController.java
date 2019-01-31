/*
 * Copyright (C) 2019 Miky Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.wekaControler.latavares;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miky Mikusher
 */
public class DBController {

  private Connection conn = null;
  // User Configurations
  String database = "wekacontrole";
  String username = "postgres";
  String password = "mikusher";

  public Connection connect() throws ClassNotFoundException {

    try {
      // Create and Check Connection
      Class.forName("org.postgresql.Driver");
      conn = DriverManager.getConnection("jdbc:postgresql:" + database, username, password);
      Logger.getLogger(DBController.class.getName()).log(Level.INFO, "Connection to DB has been established.");
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return conn;
  }

  public void insertResults(String yes, String no, String sexo, Integer idade, String filhos, String estado) throws ClassNotFoundException {

    try (Connection connect = connect();

        PreparedStatement pstmt = connect.prepareStatement(QueryConstants.QUERY_DB_INSERT.getText())) {
      pstmt.setString(1, yes);
      pstmt.setString(2, no);
      pstmt.setString(3, sexo);
      pstmt.setInt(4, idade);
      pstmt.setString(5, filhos);
      pstmt.setString(6, estado);
      pstmt.executeUpdate();

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        conn.close();
        Logger.getLogger(DBController.class.getName()).log(Level.INFO, "Connection to DB has been closed.");
      } catch (SQLException ex) {
        Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    // se não quiser uma resposta por cada linha inserida, comenta esse print!!
    // Clean Up

  }

  public void insertNewElement(String sexo, int idade, String filhos, String gasta_muito) throws ClassNotFoundException {

    try (Connection connect = connect();

        PreparedStatement pstmt = connect.prepareStatement(QueryConstants.QUERY_DB_INSERT_NEW_ELEMENT.getText())) {
      pstmt.setString(1, sexo);
      pstmt.setInt(2, idade);
      pstmt.setString(3, filhos);
      pstmt.setString(4, gasta_muito);
      pstmt.executeUpdate();

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        conn.close();
        Logger.getLogger(DBController.class.getName()).log(Level.INFO, "Connection to DB has been closed.");
      } catch (SQLException ex) {
        Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
}

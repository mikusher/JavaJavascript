/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * sqlite-jdbc-3.8.11.2.jar
 */
package cv.mikusher.qsllite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class DataBase {

     /**
     * Connect to the Agenda.s3db database
     *
     * @return the Connection object
     */
    private Connection connect(){
        // SQLite connection string
        String url = "jdbc:sqlite:D://SqlLiteData/Agenda.s3db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    /**
     * Criar uma nova Tabela
     **/
    public static void createNewTable(String tableName){
        //SQLite conexão com a base de dados
        String url = "jdbc:sqlite:D://SqlLiteData/Agenda.s3db";
        
        // SQL criação de uma nova tabela
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " (\n" 
                + "	id integer PRIMARY KEY,\n" 
                + "	nome text NOT NULL,\n" 
                + "	idade text NOT NULL,\n" 
                + "	telefone real\n" 
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // criar uma nova tabela
            stmt.execute(sql); 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    
    /**
     * 
     * @param tableToInsert
     * @param nome
     * @param idade
     * @param telefone 
     */
    public void insert(String tableToInsert, String nome, Integer idade, Integer telefone) {
        String sql = "INSERT INTO " + tableToInsert + "(nome,idade,telefone) VALUES(?,?,?)";
        
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setInt(2, idade);
            pstmt.setInt(3, telefone);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataBase app = new DataBase();
        
        //create a table
        createNewTable("utilizadores");
        
        // insert three new rows
        app.insert("utilizadores", "Luis Tavares", 28, 92555656);
        app.insert("utilizadores", "Miky Mikusher", 20, 924555656);
        app.insert("utilizadores", "MKWayne", 22, 92555886);
        
    }
    
}

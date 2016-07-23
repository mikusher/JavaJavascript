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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Sql3_CreateTable {

     /**
     * Conectar com a Base de Dados Agenda.s3db
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
        
        // SQL criação da nova tabela (id, nome, idade, telefone)
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " (\n" 
                + "	id integer PRIMARY KEY,\n" 
                + "	nome text NOT NULL,\n" 
                + "	idade text NOT NULL,\n" 
                + "	telefone real\n" 
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // executando a query
            stmt.execute(sql); 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criar a tabela com o nome de "utilizadores"
        createNewTable("utilizadores");
    } 
}

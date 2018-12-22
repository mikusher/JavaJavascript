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
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;



/**
 *
 * @author Miky Mikusher Wayne
 */
public class Sql3_CreateTable {

    /**
     * Criar uma nova Tabela com os parametros da base de dados e a tabela
     * 
     * @param dataBaseName
     *           indica a base de dados que sera chamada para efetuar a operação
     * @param tableName
     */
    public static void createNewTable(String directory, String dataBaseName, String tableName, String[] columnInput) {

        // SQLite conexão com a base de dados
        String url = "jdbc:sqlite:" + directory + dataBaseName;

        // SQL criação da nova tabela (id, nome, idade, telefone)

        String sql = "CREATE TABLE IF NOT EXISTS " +
                tableName + " (\n" +
                columnInput[0] + " integer PRIMARY KEY,\n" +
                columnInput[1] + " text NOT NULL,\n" +
                columnInput[2] + " text NOT NULL,\n" +
                columnInput[3] + " real\n" + ");";

        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
            // executando a query
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Tabela " + tableName + " criado na base de dados " + dataBaseName + " com sucesso!!");
    }





    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        String[] myColumnArray = {"id","nome","idade","telefone"};

        // criar a tabela com o nome de "utilizadores"
        createNewTable("src/cv/mikusher/qsllite/BaseDados/", "Agenda.s3db", "utilizadores", myColumnArray);
    }
}

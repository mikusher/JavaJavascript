/*
 * Copyright (C) 2017 Mikusher
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.agenda;





import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;





/**
 *
 * @author Mikusher
 */
public class OperacoesSQL {

    static final String  DATABASE_FOLDER = "src/cv/mikusher/agenda/sqlLite/";
    static final String  DATABASE_NAME   = "Funcionario.s3db";
    static final String  tableToInsert   = DATABASE_NAME.replaceAll(".s3db", "")
                                                        .trim();
    public static Logger LOGGER          = Logger.getLogger(OperacoesSQL.class.getName());





    /**
     * Conectar com a Base de Dados Agenda.s3db
     *
     * @param dataBaseName
     *            indica a base de dados que sera chamada para efetuar a operação
     * @return the Connection object
     */
    private static Connection connect() {

        // SQLite connection string
        String url = "jdbc:sqlite:" + DATABASE_FOLDER + DATABASE_NAME;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            LOGGER.warning(e.getMessage());
        }
        return conn;
    }





    /**
     * 
     */
    public static void createNewDatabase() {

        String url = "jdbc:sqlite:" + DATABASE_FOLDER + DATABASE_NAME;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                LOGGER.info("O Drive usado � " + meta.getDriverName());
                LOGGER.info("Base de dados " + DATABASE_NAME + " criado com sucesso.");
            }

        } catch (SQLException e) {
            LOGGER.warning(e.getMessage());
        }
    }





    /**
     * Criar uma nova Tabela com os parametros da base de dados e a tabela
     * 
     * @param dataBaseName
     *            indica a base de dados que sera chamada para efetuar a operação
     * @param tableName
     */
    public static void createNewTable() {

        // SQLite conexão com a base de dados
        String url = "jdbc:sqlite:" + DATABASE_FOLDER + DATABASE_NAME;

        // SQL criação da nova tabela (id, nome, idade, telefone)
        String sql = "CREATE TABLE IF NOT EXISTS " + tableToInsert + " (\n" + "	uuid text,\n" + "	id integer PRIMARY KEY,\n" + "	nome text NOT NULL,\n" + "	idade text NOT NULL,\n"
                     + "	endereco text\n" + ");";

        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
            // executando a query
            stmt.execute(sql);
        } catch (SQLException e) {
            LOGGER.warning(e.getMessage());
        }
        LOGGER.info("Tabela " + tableToInsert + " criado na base de dados " + DATABASE_NAME + " com sucesso!!");
    }





    /**
     * Para o inserta das informações na tabela, tem de passar alguns dados!!
     * 
     * @param dataBaseName
     *            indica a base de dados que sera chamada para efetuar a operação
     * @param tableToInsert
     *            o nome da tabela a ser utilizado
     * @param nome
     *            o nome do contato
     * @param idade
     *            a idade do contato
     * @param telefone
     *            o numero de telefone do contato
     */
    public static void insert(String uuid, Integer id, String nome, Integer idade, String endereco) {

        String sql = "INSERT INTO " + tableToInsert + "(uuid,id,nome,idade,endereco) VALUES(?,?,?,?,?)";

        try (Connection conn = connect();

                        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, uuid);
            pstmt.setInt(2, id);
            pstmt.setString(3, nome);
            pstmt.setInt(4, idade);
            pstmt.setString(5, endereco);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            LOGGER.warning(e.getMessage());
        }

        // se não quiser uma resposta por cada linha inserida, comenta esse print!!
        LOGGER.info("Linha inserida com sucesso!");
        // System.out.println("Linha inserida com sucesso!");
    }





    public static void deleteuser() {

    }
}

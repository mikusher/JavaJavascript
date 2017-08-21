/*
 * Copyright (C) 2017 Mikusher
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */

package cv.mikusher.agenda.classe;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mikusher
 */
public class OperacoesSQL {

	static final String DATABASE_FOLDER = "src/cv/mikusher/agenda/sqlLite/";
	static final String DATABASE_NAME = "Funcionario.s3db";
	static final String GENERAL_TABLE = DATABASE_NAME.replaceAll(".s3db", "").trim();

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
			LoggOperation.LOGGER.warning(e.getMessage());
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
				LoggOperation.LOGGER.info("O Drive usado � " + meta.getDriverName());
				LoggOperation.LOGGER.info("Base de dados " + DATABASE_NAME + " criado com sucesso.");
			}

		} catch (SQLException e) {
			LoggOperation.LOGGER.warning(e.getMessage());
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
		String sql = "CREATE TABLE IF NOT EXISTS " + GENERAL_TABLE + " (\n" + "	uuid text,\n"
				+ "	id integer PRIMARY KEY,\n" + "	nome text NOT NULL,\n" + "	idade integer NOT NULL,\n"
				+ "	endereco text\n" + ");";

		try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
			// executando a query
			stmt.execute(sql);
		} catch (SQLException e) {
			LoggOperation.LOGGER.warning(e.getMessage());
		}
		LoggOperation.LOGGER
				.info("Tabela " + GENERAL_TABLE + " criado na base de dados " + DATABASE_NAME + " com sucesso!!");
	}

	/**
	 * Para o inserta das informações na tabela, tem de passar alguns dados!!
	 * 
	 * @param dataBaseName
	 *            indica a base de dados que sera chamada para efetuar a operação
	 * @param GENERAL_TABLE
	 *            o nome da tabela a ser utilizado
	 * @param nome
	 *            o nome do contato
	 * @param idade
	 *            a idade do contato
	 * @param telefone
	 *            o numero de telefone do contato
	 */
	public static void insert(String uuid, Integer id, String nome, Integer idade, String endereco) {

		String sql = "INSERT INTO " + GENERAL_TABLE + "(uuid,id,nome,idade,endereco) VALUES(?,?,?,?,?)";

		try (Connection conn = connect();

				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, uuid);
			pstmt.setInt(2, id);
			pstmt.setString(3, nome);
			pstmt.setInt(4, idade);
			pstmt.setString(5, endereco);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			LoggOperation.LOGGER.warning(e.getMessage());
		}

		// se não quiser uma resposta por cada linha inserida, comenta esse print!!
		LoggOperation.LOGGER.info("Linha inserida com sucesso!");
		// System.out.println("Linha inserida com sucesso!");
	}

	public static void deleteSQLUser(Integer id) {

		String sql = "DELETE FROM " + GENERAL_TABLE + " WHERE id = ?";

		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			LoggOperation.LOGGER.warning(e.getMessage());
		}
		LoggOperation.LOGGER.info("Linha apagado com sucesso.!");
	}

	public static void updateUser(int id, String nome, int idade, String endereco) {

		String sql = "UPDATE " + GENERAL_TABLE + " SET nome = ?, idade = ?, endereco = ? " + "WHERE id = ?";

		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setString(1, nome);
			pstmt.setInt(2, idade);
			pstmt.setString(3, endereco);
			pstmt.setInt(4, id);

			// update
			pstmt.executeUpdate();
		} catch (SQLException e) {
			LoggOperation.LOGGER.warning(e.getMessage());
		}
		LoggOperation.LOGGER.info("Linha atualizado com sucesso!");
	}
}

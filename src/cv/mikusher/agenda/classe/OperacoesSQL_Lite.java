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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mikusher
 */
public class OperacoesSQL_Lite extends ConnectionToSQL implements QueryOperation{


	/**
	 * 
	 */
	public static void createNewDatabase() {

		try (Connection conn = connect("lite")) {
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				LoggOperation.LOGGER.info("O Drive usado é " + meta.getDriverName());
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
		try (Connection conn = connect("lite"); Statement stmt = conn.createStatement()) {
			// executando a query
			stmt.execute(liteCreateTable);
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

		try (Connection conn = connect("lite");

                        PreparedStatement pstmt = conn.prepareStatement(liteInsert)) {
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

		try (Connection conn = connect("lite"); PreparedStatement pstmt = conn.prepareStatement(liteDelete)) {
			pstmt.setInt(1, id);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			LoggOperation.LOGGER.warning(e.getMessage());
		}
		LoggOperation.LOGGER.info("Linha apagado com sucesso.!");
	}

	public static void updateUser(int id, String nome, int idade, String endereco) {

		try (Connection conn = connect("lite"); PreparedStatement pstmt = conn.prepareStatement(liteUpdate)) {

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

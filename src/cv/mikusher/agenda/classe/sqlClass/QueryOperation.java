/*
 * Copyright (C) 2017 Luis Tavares
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.agenda.classe.sqlClass;





/**
 *
 * @author Luis Amilcar Tavares
 */
public interface QueryOperation extends ConstantesSQL {

    // -- Query for SqlLite
    // SQL cria��o da nova tabela (id, nome, idade, telefone)
    String liteCreateTable = "CREATE TABLE IF NOT EXISTS " + GENERAL_TABLE + " (\n" + "	uuid text,\n" + "	id integer PRIMARY KEY,\n" + "	nome text NOT NULL,\n" + "	idade integer NOT NULL,\n"
                             + "	endereco text\n" + ");";

    // Operation SqlLite - Insert
    String liteInsert      = "INSERT INTO " + GENERAL_TABLE + "(uuid,id,nome,idade,endereco) VALUES(?,?,?,?,?)";

    // Operation SqlLite - Delete
    String liteDelete      = "DELETE FROM " + GENERAL_TABLE + " WHERE id = ?";

    // Operation SqlLite - Update
    String liteUpdate      = "UPDATE " + GENERAL_TABLE + " SET nome = ?, idade = ?, endereco = ? " + "WHERE id = ?";

    // -- Query for Postgres
    String psqlCreateTable = "CREATE TABLE IF NOT EXISTS " + GENERAL_TABLE + " (\n" + " uuid text,\n" + "   id int PRIMARY KEY,\n" + "  nome text NOT NULL,\n" + "  idade int NOT NULL,\n"
                             + "    endereco text\n" + ");";

    // Operation Postgres - Insert
    String psqlInsert      = "INSERT INTO " + GENERAL_TABLE + "(uuid,id,nome,idade,endereco) VALUES(?,?,?,?,?)";

    // Operation Postgres - Delete
    String psqlDelete      = "DELETE FROM " + GENERAL_TABLE + " WHERE id = ?";

    // Operation Postgres - Update
    String psqlUpdate      = "UPDATE " + GENERAL_TABLE + " SET nome = ?, idade = ?, endereco = ? " + "WHERE id = ?";

    // Operation Users
    String queryUSERS      = "SELECT users_name, users_password FROM users_login;";

    // Operation Users to login
    String queryNewUSERS   = "INSERT INTO users_login (users_name, users_password) VALUES (?, ?);";

    String queryDeleteUSERS = "DELETE FROM users_login WHERE users_name = ?;";

}

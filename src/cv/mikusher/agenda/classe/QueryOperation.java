/*
 * Copyright (C) 2017 Luis Tavares
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.agenda.classe;

/**
 *
 * @author Luis Tavares
 */
public interface QueryOperation extends ConstantesSQL{
    
    //Query for SqlLite
    // SQL criação da nova tabela (id, nome, idade, telefone)
    String liteCreateTable = "CREATE TABLE IF NOT EXISTS " + GENERAL_TABLE + " (\n" + "	uuid text,\n"
                    + "	id integer PRIMARY KEY,\n" + "	nome text NOT NULL,\n" + "	idade integer NOT NULL,\n"
                    + "	endereco text\n" + ");";
    
    //Operação de Insert
    String liteInsert = "INSERT INTO " + GENERAL_TABLE + "(uuid,id,nome,idade,endereco) VALUES(?,?,?,?,?)";
    
    //Operação de Delete
    String liteDelete = "DELETE FROM " + ConstantesSQL.GENERAL_TABLE + " WHERE id = ?";
    
    //Operação de Update
    String liteUpdate = "UPDATE " + ConstantesSQL.GENERAL_TABLE + " SET nome = ?, idade = ?, endereco = ? " + "WHERE id = ?";
    
    //Query for Postgres
    
}

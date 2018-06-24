/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.qsllite;





/**
 *
 * @author Miky Mikusher Wayne
 */
public class Sql_Principal {

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {

        Sql4_InsertDate id = new Sql4_InsertDate();
        String[] column = {"id","nome","idade","telefone"};

        // criando a base de dados
        Sql2_CreateDataBase.createNewDatabase("src/cv/mikusher/qsllite/BaseDados/", "Agenda.s3db");

        // criando a tabela, na base de dados
        Sql3_CreateTable.createNewTable("src/cv/mikusher/qsllite/BaseDados/", "Contatos.s3db", "UTILIZADOR", column);
        Sql3_CreateTable.createNewTable("src/cv/mikusher/qsllite/BaseDados/", "Contatos.s3db", "CONTATOS", column);

        // inserindo dados na base de dados
        id.insert("Contatos.s3db", "UTILIZADOR", "Luis Tavares", 28, 92555656);
        id.insert("Contatos.s3db", "UTILIZADOR", "Helio Tavares", 22, 92775658);
        id.insert("Contatos.s3db", "CONTATOS", "Miky Mikusher", 22, 22775658);
        id.insert("Contatos.s3db", "CONTATOS", "Palomba", 26, 22775658);

    }
}
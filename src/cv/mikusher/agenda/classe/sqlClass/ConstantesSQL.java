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
public interface ConstantesSQL {

    String              _conf           = "mikusher";

    // SQLLite Configuration
    String DATABASE_FOLDER = "src/cv/mikusher/agenda/sqlLite/";
    String DATABASE_NAME   = "Funcionarios.s3db";
    String GENERAL_TABLE   = DATABASE_NAME.replaceAll(".s3db", "")
                                                       .trim();
    String SQLLite         = "jdbc:sqlite:" + DATABASE_FOLDER + DATABASE_NAME;

    // Postgres Configuration / Login validation
    String POSTGRES        = "jdbc:postgresql://127.0.0.1:5432/" + GENERAL_TABLE;
    String pUser           = _conf;
    String pPassword       = _conf;

}

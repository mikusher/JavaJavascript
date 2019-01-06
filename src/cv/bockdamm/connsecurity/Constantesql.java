/*
 * Copyright (C) 2017 Luis Tavares
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.bockdamm.connsecurity;





/**
 *
 * @author Luis Amilcar Tavares
 */
public interface Constantesql {

    String GENERAL_TABLE      = "wekacontrole";

    // Postgres Configuration / Login validation
    String DATABASE_FOLDER    = "src/cv/bockdamm/tst/";
    String DATABASE_NAME      = "Sales.db";
    String SQLITE             = "jdbc:sqlite:" + DATABASE_FOLDER + DATABASE_NAME.replaceAll(".db", "")
                                                                                .trim();

    String postgresconnection = "jdbc:postgresql://localhost:5433/" + GENERAL_TABLE;
    String postgresuser       = "postgres";
    String postgrespassword   = "mikusher";

}

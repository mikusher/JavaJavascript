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
public interface ConstantesSQL {
          
        //SQLLite Configuration 
        static final String DATABASE_FOLDER = "src/cv/mikusher/agenda/sqlLite/";
	static final String DATABASE_NAME = "Funcionarios.s3db";
        static final String GENERAL_TABLE = DATABASE_NAME.replaceAll(".s3db", "").trim();
        static final String SQLLite   = "jdbc:sqlite:" + DATABASE_FOLDER + DATABASE_NAME;
        
        //Postgres Configuration 
        static final String POSTGRES  = "jdbc:postgresql://127.0.0.1:5432/"+GENERAL_TABLE;
        static final String pUser     = "mikusher";
        static final String pPassword = "postgres";
	
}

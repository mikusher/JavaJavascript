/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * D:\sqlite-jdbc-3.8.11.2.jar
 */
package cv.mikusher.qsllite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Sql5_DeleteDate {
        
     /**
     * Conectar com a Base de Dados Agenda.s3db
     *
     * @return the Connection object
     */
    private Connection connect(){
        // SQLite connection string
        String url = "jdbc:sqlite:D://SqlLiteData/Agenda.s3db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    /**
     * Para apagar um determinado elemento na tabela
     * @param tableToDeleteDate indica o nome da tabela a ser utilizada
     * @param id indicar qual o ID em que será apagada
     */
    public void DeleteDate(String tableToDeleteDate, int id){
        String sql = "DELETE FROM " +tableToDeleteDate+  " WHERE id = ?"; 
        
        try (Connection conn = this.connect();
                
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sql5_DeleteDate dl = new Sql5_DeleteDate();
        
        // deletar a linha com o id 3
        dl.DeleteDate("utilizadores", 3);
    }
    
}

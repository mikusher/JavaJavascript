/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
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
public class Sql7_UpdateDate {
     /**
     * Conectar com a Base de Dados Agenda.s3db
     * @param dataBaseName indica a base de dados que sera chamada para efetuar a operação
     * @return the Connection object
     */
    private Connection connect(String dataBaseName){
        // SQLite connection string
        String url = "jdbc:sqlite:D://SqlLiteData/" +dataBaseName;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    /**
     * Atualização de uma linha na base de dados
     * @param dataBaseName indica a base de dados que sera chamada para efetuar a operação
     * @param id indica o id, chave da linha
     * @param tableToSelect indica o nome da tabela em que sera feita a alteração
     * @param nome indica o nome do individuo a ser alocado
     * @param idade indica a idado do utilizador
     * @param telefone indica o telefone 
     */
    public void update(String dataBaseName, int id, String tableToSelect, String nome, int idade, int telefone) {
        String sql = "UPDATE "+tableToSelect+" SET nome = ? , " 
                + "idade = ? , " 
                + "telefone = ? " 
                + "WHERE id = ?";
        
        try (Connection conn = this.connect(dataBaseName);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, nome);
            pstmt.setInt(2, idade);
            pstmt.setInt(3, telefone);
            pstmt.setInt(4, id);
            
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Linha atualizado com sucesso!!");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sql7_UpdateDate up = new Sql7_UpdateDate();
        up.update("Agenda.s3db", 3, "utilizadores", "Helio Tavares", 20, 25645213);
    }
}
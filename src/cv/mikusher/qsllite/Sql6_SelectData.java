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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Sql6_SelectData {
    
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
     * Apresenta todos os nomes da tabela
     * @param tableToSelect escolhes o nome da tabela em que sera consultada, 
     * todos os dados da tabela sera apresentada.
     */
    public void SelectAll(String tableToSelect){
        String sql = "SELECT nome, idade, telefone FROM "+tableToSelect;
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("nome") +  "\t" + 
                                   rs.getInt("idade") + "\t" +
                                   rs.getInt("telefone"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Apresenta somente a linha selecionada, de acordo com os parametros passados 
     * @param tableToSelect escolhes o nome da tabela em que sera consultada, 
     * todos os dados da tabela sera apresentada.
     * @param nome selecione o nome a ser procurado, tem de ser passado entre % %, 
     * como no exemplo: sd.getSelectData("utilizadores", "%Luis%");
     * Afinal a pesquisa é feita utilizando o nome -> Like ?
     */
    public void getSelectData(String tableToSelect, String nome){
        String sql = "SELECT nome, idade, telefone " + "FROM "+tableToSelect+ " WHERE nome like ?";   
        
                try (Connection conn = this.connect();
             PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            // passar o valor
            pstmt.setString(1, nome);
            //
            ResultSet rs  = pstmt.executeQuery();
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("nome") + "\t" + 
                                   rs.getInt("idade") + "\t" +
                                   rs.getInt("telefone"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sql6_SelectData sd = new Sql6_SelectData();
        
        //selecione todas as linhas da tabela 
        // sd.SelectAll("utilizadores");
        
        //selecione a linha de acordo com o nome passado 
        sd.getSelectData("utilizadores", "%Luis%");
    } 
}

/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * D:\sqlite-jdbc-3.8.11.2.jar
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
     * @param dataBaseName
     *            indica a base de dados que sera chamada para efetuar a operação
     * @return the Connection object
     */
    private Connection connect(String dataBaseName) {

        // SQLite connection string
        String url = "jdbc:sqlite:src/cv/mikusher/qsllite/BaseDados/" + dataBaseName;
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
     * 
     * @param dataBaseName
     *            indica a base de dados que sera chamada para efetuar a operação
     * @param tableToSelect
     *            escolhes o nome da tabela em que sera consultada,
     *            todos os dados da tabela sera apresentada.
     */
    public void SelectAll(String dataBaseName, String tableToSelect) {

        String sql = "SELECT nome, idade, telefone FROM " + tableToSelect;

        try (Connection conn = this.connect(dataBaseName); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("nome") + "\t" + rs.getInt("idade") + "\t" + rs.getInt("telefone"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }





    /**
     * Apresenta somente a linha selecionada, de acordo com os parametros passados
     * 
     * @param dataBaseName
     *            indica a base de dados que sera chamada para efetuar a operação
     * @param tableToSelect
     *            escolhes o nome da tabela em que sera consultada,
     *            todos os dados da tabela sera apresentada.
     * @param nome
     *            selecione o nome a ser procurado, tem de ser passado entre % %,
     *            como no exemplo: sd.getSelectData("utilizadores", "%Luis%");
     *            Afinal a pesquisa é feita utilizando o nome -> Like ?
     */
    public void getSelectData(String dataBaseName, String tableToSelect, String nome) {

        String sql = "SELECT nome, idade, telefone " + "FROM " + tableToSelect + " WHERE nome like ?";

        try (Connection conn = this.connect(dataBaseName); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // passar o valor
            pstmt.setString(1, nome);
            //
            ResultSet rs = pstmt.executeQuery();

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("nome") + "\t" + rs.getInt("idade") + "\t" + rs.getInt("telefone"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }





    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Sql6_SelectData sd = new Sql6_SelectData();

        // selecione todas as linhas da tabela
        // sd.SelectAll("Agenda.s3db", "utilizadores");

        // selecione a linha de acordo com o nome passado
        sd.getSelectData("Agenda.s3db", "utilizadores", "%Luis%");
    }
}

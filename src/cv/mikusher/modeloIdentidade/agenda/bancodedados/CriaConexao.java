/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





package cv.mikusher.modeloIdentidade.agenda.bancodedados;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





/**
 *
 * @author Miky Mikusher Wayne
 */
public class CriaConexao {

    public static Connection getConexao() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectado com o Banco");
            return DriverManager.getConnection("jdbc:mysql://localhost/agendabd", "root", "vertrigo");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }

}

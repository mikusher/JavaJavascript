/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





package cv.mikusher.modeloIdentidade.agenda.combina;





import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import cv.mikusher.modeloIdentidade.agenda.bancodedados.CriaConexao;
import cv.mikusher.modeloIdentidade.agenda.codigo.ContatosProfessor;





/**
 *
 * @author Miky Mikusher Wayne
 */
public class ContatoProfessorCombina {

    private Connection conexao;





    public ContatoProfessorCombina() throws SQLException {

        this.conexao = (Connection) CriaConexao.getConexao();
    }





    public void adicionaprof(ContatosProfessor cp) throws SQLException {

        String sql = "insert into professor(nome, telefone, email, sexo, departamento)" + "values(?,?,?,?,?)";
        PreparedStatement stmt2 = conexao.prepareStatement(sql);

        stmt2.setString(1, cp.getNome());
        stmt2.setString(2, cp.getTelefone());
        stmt2.setString(3, cp.getEmail());
        stmt2.setString(4, cp.getSexo());
        stmt2.setString(5, cp.getDepartamento());

        stmt2.execute();
        stmt2.close();
    }





    public List<ContatosProfessor> getLista(String nome) throws SQLException {

        String sql = "select * from contato where nome like ?";
        PreparedStatement stmt2 = this.conexao.prepareStatement(sql);
        stmt2.setString(1, nome);
        ResultSet rs2 = stmt2.executeQuery();
        List<ContatosProfessor> minhaLista = new ArrayList<ContatosProfessor>();

        while (rs2.next()) {
            ContatosProfessor cp = new ContatosProfessor();
            cp.setId(Long.valueOf(rs2.getString("Id")));
            cp.setNome(rs2.getString("nome"));
            cp.setTelefone(rs2.getString("telefone"));
            cp.setEmail(rs2.getString("email"));
            cp.setSexo(rs2.getString("sexo"));
            cp.setDepartamento(rs2.getString("departamento"));
            minhaLista.add(cp);
        }
        rs2.close();
        stmt2.close();
        return minhaLista;
    }





    public void alteraprof(ContatosProfessor cp2) throws SQLException {

        String sql = "update contato set nome=?, telefone=?, email=?, sexo=?, departamento=? where id=?";
        PreparedStatement stmt2 = conexao.prepareStatement(sql);
        // seta os valores
        stmt2.setString(1, cp2.getNome());
        stmt2.setString(2, cp2.getTelefone());
        stmt2.setString(3, cp2.getEmail());
        stmt2.setString(4, cp2.getSexo());
        stmt2.setString(5, cp2.getDepartamento());
        stmt2.setLong(6, cp2.getId());
        // executa o codigo sql
        stmt2.execute();
        stmt2.close();
    }





    public void removeprof(ContatosProfessor cp3) throws SQLException {

        String sql = "delete from contato where id=?";
        PreparedStatement stmt2 = conexao.prepareStatement(sql);
        stmt2.setLong(1, cp3.getId());
        stmt2.execute();
        stmt2.close();
    }
}

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
import cv.mikusher.modeloIdentidade.agenda.codigo.ContatosAluno;





/**
 *
 * @author Miky Mikusher Wayne
 */
public class ContatoAlunoCombina {

    private final Connection conexao;





    public ContatoAlunoCombina() throws SQLException {

        this.conexao = (Connection) CriaConexao.getConexao();
    }





    public void adiciona(ContatosAluno cx1) throws SQLException {

        // prepara a conexão
        String sql = "insert into contato (nome, endereco, telefone, email, sexo, grau, disciplinas)" + "values (?,?,?,?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        // seta os valores
        stmt.setString(1, cx1.getNome());
        stmt.setString(2, cx1.getEndereco());
        stmt.setString(3, cx1.getTelefone());
        stmt.setString(4, cx1.getEmail());
        stmt.setString(5, cx1.getSexo());
        stmt.setString(6, cx1.getGrau());
        stmt.setString(7, cx1.getDisciplinas());

        // executa o codigo sql
        stmt.execute();
        stmt.close();
    }





    public List<ContatosAluno> getLista(String nome) throws SQLException {

        String sql = "select * from contato where nome like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        List<ContatosAluno> minhaLista = new ArrayList<ContatosAluno>();

        while (rs.next()) {
            ContatosAluno c1 = new ContatosAluno();
            c1.setId(Long.valueOf(rs.getString("Id")));
            c1.setNome(rs.getString("nome"));
            c1.setEndereco(rs.getString("endereco"));
            c1.setTelefone(rs.getString("telefone"));
            c1.setEmail(rs.getString("email"));
            c1.setSexo(rs.getString("sexo"));
            c1.setGrau(rs.getString("grau"));
            c1.setDisciplinas(rs.getString("disciplinas"));
            minhaLista.add(c1);
        }

        rs.close();
        stmt.close();
        return minhaLista;
    }





    public void altera(ContatosAluno cx2) throws SQLException {

        String sql = "update contato set nome=?, endereco=?, telefone=?, email=?, sexo=?, grau=?, disciplinas=? where id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        // seta os valores
        stmt.setString(1, cx2.getNome());
        stmt.setString(2, cx2.getEndereco());
        stmt.setString(3, cx2.getTelefone());
        stmt.setString(4, cx2.getEmail());
        stmt.setString(5, cx2.getSexo());
        stmt.setString(6, cx2.getGrau());
        stmt.setString(7, cx2.getDisciplinas());
        stmt.setLong(8, cx2.getId());
        // executa o codigo sql
        stmt.execute();
        stmt.close();
    }





    public void remove(ContatosAluno cx3) throws SQLException {

        String sql = "delete from contato where id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setLong(1, cx3.getId());
        stmt.execute();
        stmt.close();
    }
}
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
import cv.mikusher.modeloIdentidade.agenda.bancodedados.QueryStatement;
import cv.mikusher.modeloIdentidade.agenda.bancodedados.Utils;
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

        // seta os valores
        try ( // prepara a conexão
                PreparedStatement stmt = conexao.prepareStatement(QueryStatement.ADDSTUD.query())) {
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
        }
    }





    public List<ContatosAluno> getLista(String nome) throws SQLException {

        List<ContatosAluno> minhaLista;
        try (PreparedStatement stmt = this.conexao.prepareStatement(QueryStatement.LISTSTUD.query())) {
            stmt.setString(1, nome);
            try (ResultSet rs = stmt.executeQuery()) {
                minhaLista = new ArrayList<>();
                while (rs.next()) {
                    ContatosAluno c1 = new ContatosAluno();
                    c1.setId(Long.valueOf(rs.getString(Utils.id.toString())));
                    c1.setNome(rs.getString(Utils.nome.toString()));
                    c1.setEndereco(rs.getString(Utils.endereco.toString()));
                    c1.setTelefone(rs.getString(Utils.telefone.toString()));
                    c1.setEmail(rs.getString(Utils.email.toString()));
                    c1.setSexo(rs.getString(Utils.sexo.toString()));
                    c1.setGrau(rs.getString(Utils.grau.toString()));
                    c1.setDisciplinas(rs.getString(Utils.disciplina.toString()));
                    minhaLista.add(c1);
                }
            }
        }
        return minhaLista;
    }





    public void altera(ContatosAluno cx2) throws SQLException {

        // seta os valores
        try (PreparedStatement stmt = conexao.prepareStatement(QueryStatement.ALTSTUD.query())) {
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
        }
    }





    public void remove(ContatosAluno cx3) throws SQLException {

        try (PreparedStatement stmt = conexao.prepareStatement(QueryStatement.REMOVESTUD.query())) {
            stmt.setLong(1, cx3.getId());
            stmt.execute();
        }
    }
}
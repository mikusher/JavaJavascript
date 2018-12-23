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
import cv.mikusher.modeloIdentidade.agenda.codigo.ContatosProfessor;





/**
 *
 * @author Miky Mikusher Wayne
 */
public class ContatoProfessorCombina {

    private final Connection conexao;





    public ContatoProfessorCombina() throws SQLException {

        this.conexao = (Connection) CriaConexao.getConexao();
    }





    public void adicionaprof(ContatosProfessor cp) throws SQLException {

        try (PreparedStatement stmt2 = conexao.prepareStatement(QueryStatement.ADDPROF.query())) {
            stmt2.setString(1, cp.getNome());
            stmt2.setString(2, cp.getTelefone());
            stmt2.setString(3, cp.getEmail());
            stmt2.setString(4, cp.getSexo());
            stmt2.setString(5, cp.getDepartamento());

            stmt2.execute();
        }
    }





    public List<ContatosProfessor> getLista(String nome) throws SQLException {

        List<ContatosProfessor> minhaLista;
        try (PreparedStatement stmt2 = this.conexao.prepareStatement(QueryStatement.LISTPROF.query())) {
            stmt2.setString(1, nome);
            try (ResultSet rs2 = stmt2.executeQuery()) {
                minhaLista = new ArrayList<>();
                while (rs2.next()) {
                    ContatosProfessor cp = new ContatosProfessor();
                    cp.setId(Long.valueOf(rs2.getString(Utils.id.toString())));
                    cp.setNome(rs2.getString(Utils.nome.toString()));
                    cp.setTelefone(rs2.getString(Utils.telefone.toString()));
                    cp.setEmail(rs2.getString(Utils.email.toString()));
                    cp.setSexo(rs2.getString(Utils.sexo.toString()));
                    cp.setDepartamento(rs2.getString(Utils.departamento.toString()));
                    minhaLista.add(cp);
                }
            }
        }
        return minhaLista;
    }





    public void alteraprof(ContatosProfessor cp2) throws SQLException {

        // seta os valores
        try (PreparedStatement stmt2 = conexao.prepareStatement(QueryStatement.ALTPROF.query())) {
            // seta os valores
            stmt2.setString(1, cp2.getNome());
            stmt2.setString(2, cp2.getTelefone());
            stmt2.setString(3, cp2.getEmail());
            stmt2.setString(4, cp2.getSexo());
            stmt2.setString(5, cp2.getDepartamento());
            stmt2.setLong(6, cp2.getId());
            // executa o codigo sql
            stmt2.execute();
        }
    }





    public void removeprof(ContatosProfessor cp3) throws SQLException {

        try (PreparedStatement stmt2 = conexao.prepareStatement(QueryStatement.REMOVEPROF.query())) {
            stmt2.setLong(1, cp3.getId());
            stmt2.execute();
        }
    }
}

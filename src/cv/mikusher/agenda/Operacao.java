/*
 * Copyright (C) 2017 latavares - 27/07/2017
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */





package cv.mikusher.agenda;





import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;





public class Operacao {

    private static final String DADOS_EMPREGADO = "src/cv/mikusher/agenda/dados/empregado_";
    static String               _uuid           = "null";
    Pessoa                      p               = new Pessoa();





    public void gravarUtilizador(Object nome, Object endereco, Object idade, Object id, Object uuid) {

        p.setNome(nome.toString());
        p.setEndereco(endereco.toString());
        p.setIdade(Integer.parseInt(idade.toString()));
        p.setId(Integer.parseInt(id.toString()));
        p.setUUID(null);

        try {
            FileOutputStream fileOut = new FileOutputStream(DADOS_EMPREGADO + p.getId() + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p);
            out.close();
            fileOut.close();
            System.out.println("Serializacao gravado com sucesso em: src/cv/mikusher/agenda/dados/empregado_" + p.getId() + ".ser");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }





    /**
     * @param p
     * @return
     */
    public Pessoa pesquisarUtilizador(Object idpesp) {

        p.setidPesquisa(Integer.parseInt(idpesp.toString()));

        try {
            FileInputStream fileEntrada = new FileInputStream(DADOS_EMPREGADO + p.getidPesquisa() + ".ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileEntrada);
            p = (Pessoa) inputStream.readObject();
            inputStream.close();
            fileEntrada.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "O id " + p.getidPesquisa() + " nao existe.", "Funcionario nao existe", JOptionPane.CANCEL_OPTION);
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Pessoa nao encontrado");
            return null;
        }
        return p;
    }

}

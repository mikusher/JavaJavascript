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





package cv.mikusher.agenda.classe;





import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;





public class Operacao {

    private static final String DADOS_EMPREGADO_SERIAL = "src/cv/mikusher/agenda/serie/Empregado_";
    private static final String DADOS_EMPREGADO_XML    = "src/cv/mikusher/agenda/xml/Empregado_";
    static String               _uuid                  = "null";
    Pessoa                      p                      = new Pessoa();
    OperacoesSQL                oprS                   = new OperacoesSQL();





    public void gravarUtilizador(Object nome, Object endereco, Object idade, Object id, Object uuid) throws ParserConfigurationException, TransformerException {

        p.setNome(nome.toString());
        p.setEndereco(endereco.toString());
        p.setIdade(Integer.parseInt(idade.toString()));
        p.setId(Integer.parseInt(id.toString()));
        p.setUUID(null);

        try {
            // -----------------------SER / XML Configuration----------------------- //
            saveOperationSER();
            saveOperationXML();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }





    public void gravarBeforEditUser(Object nome, Object endereco, Object idade) throws ParserConfigurationException, TransformerException {

        p.setNome(nome.toString());
        p.setEndereco(endereco.toString());
        p.setIdade(Integer.parseInt(idade.toString()));

        try {
            // -----------------------SER / XML Configuration----------------------- //
            saveOperationSER();
            saveOperationXML();

        } catch (Exception e) {
            OperacoesSQL.LOGGER.warning("Não foi possivel gravar");
            e.printStackTrace();
        }

    }





    public void saveOperationSER() throws FileNotFoundException, IOException {

        FileOutputStream fileOut = new FileOutputStream(DADOS_EMPREGADO_SERIAL + p.getId() + ".ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(p);
        out.close();
        fileOut.close();
        oprS.LOGGER.info("Serializacao gravado com sucesso em: src/cv/mikusher/agenda/serie/Empregado_" + p.getId() + ".ser");
    }





    public void saveOperationXML() throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerConfigurationException, TransformerException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // root elements
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Identidade");
        doc.appendChild(rootElement);

        // staff elements
        Element staff = doc.createElement("Funcionario");
        rootElement.appendChild(staff);

        // set attribute to staff element
        Attr func_uuid = doc.createAttribute("Uuid");
        func_uuid.setValue(String.valueOf(p.getUUID()));
        staff.setAttributeNode(func_uuid);

        // firstname elements
        Element func_name = doc.createElement("Nome");
        func_name.appendChild(doc.createTextNode(p.getNome()));
        staff.appendChild(func_name);

        // lastname elements
        Element func_ender = doc.createElement("Endereco");
        func_ender.appendChild(doc.createTextNode(p.getEndereco()));
        staff.appendChild(func_ender);

        // nickname elements
        Element func_idade = doc.createElement("Idade");
        func_idade.appendChild(doc.createTextNode(String.valueOf(p.getIdade())));
        staff.appendChild(func_idade);

        // salary elements
        Element func_salario = doc.createElement("Salario");
        func_salario.appendChild(doc.createTextNode(String.valueOf(p.getSalario())));
        staff.appendChild(func_salario);

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(DADOS_EMPREGADO_XML + p.getId() + ".xml"));

        // Output to console for testing
        // StreamResult result = new StreamResult(System.out);

        transformer.transform(source, result);

        oprS.LOGGER.info("File xml saved!");
    }





    /**
     * 
     * @param id
     */
    public static void deleteFileUser(Integer id) {

        File deleteXML = new File(DADOS_EMPREGADO_XML + id + ".xml");
        File deleteSER = new File(DADOS_EMPREGADO_SERIAL + id + ".ser");

        try {
            if (deleteSER.exists() && deleteXML.exists()) {
                deleteXML.delete();
                deleteSER.delete();
                OperacoesSQL.LOGGER.info("File XML and SER delete!");
            } else {
                OperacoesSQL.LOGGER.info("Delete operation is failed!");
                JOptionPane.showMessageDialog(null, "O id " + id + " nao existe.");
            }

        } catch (Exception e) {
            OperacoesSQL.LOGGER.warning(e.getMessage());
        }
    }





    /**
     * @param p
     * @return
     */
    public Pessoa pesquisarUtilizador(Object idpesp) {

        p.setidPesquisa(Integer.parseInt(idpesp.toString()));

        try {
            FileInputStream fileEntrada = new FileInputStream(DADOS_EMPREGADO_SERIAL + p.getidPesquisa() + ".ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileEntrada);
            p = (Pessoa) inputStream.readObject();
            inputStream.close();
            fileEntrada.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "O id " + p.getidPesquisa() + " nao existe.", "Funcionario nao existe", JOptionPane.CANCEL_OPTION);
            return null;
        } catch (ClassNotFoundException c) {
            oprS.LOGGER.info("Pessoa nao encontrado");
            return null;
        }
        return p;
    }





    public Pessoa checkUtilizador(Object idpesp) {

        p.setidPesquisa(Integer.parseInt(idpesp.toString()));

        try {
            FileInputStream fileEntrada = new FileInputStream(DADOS_EMPREGADO_SERIAL + p.getidPesquisa() + ".ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileEntrada);
            p = (Pessoa) inputStream.readObject();
            inputStream.close();
            fileEntrada.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "O id " + p.getidPesquisa() + " nao existe.", "Funcionario nao existe", JOptionPane.CANCEL_OPTION);
            return null;
        } catch (ClassNotFoundException c) {
            oprS.LOGGER.info("Pessoa nao encontrado");
            return null;
        }
        return p;
    }

}

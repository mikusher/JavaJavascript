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

/**
 * Luis Amilcar Tavares
 */





package cv.mikusher.agenda.classe;





import static cv.mikusher.agenda.classe.LoggOperation.LOGGER;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;

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
    // OperacoesSQL_Lite oprS = new OperacoesSQL_Lite();





    public void gravarUtilizador(Object nome, Object endereco, Object idade, Object id, Object uuid) throws ParserConfigurationException, TransformerException {

        this.p.setNome(nome.toString());
        this.p.setEndereco(endereco.toString());
        this.p.setIdade(Integer.parseInt(idade.toString()));
        this.p.setId(Integer.parseInt(id.toString()));
        this.p.setUUID(null);

        try {
            // -----------------------SER / XML Configuration----------------------- //
            saveOperationSER();
            saveOperationXML();

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error occur on add user.", e);
        }

    }





    public void gravarBeforEditUser(Object nome, Object endereco, Object idade) throws ParserConfigurationException, TransformerException {

        this.p.setNome(nome.toString());
        this.p.setEndereco(endereco.toString());
        this.p.setIdade(Integer.parseInt(idade.toString()));

        try {
            // -----------------------SER / XML Configuration----------------------- //
            saveOperationSER();
            saveOperationXML();

        } catch (IOException | ParserConfigurationException | TransformerException e) {
            LoggOperation.LOGGER.log(Level.SEVERE, "Não foi possivel gravar", e);
        }

    }





    public void saveOperationSER() throws FileNotFoundException, IOException {

        try (FileOutputStream fileOut = new FileOutputStream(DADOS_EMPREGADO_SERIAL + this.p.getId() + ".ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(this.p);
        } catch (FileNotFoundException e) {
            LoggOperation.LOGGER.log(Level.SEVERE, "Não foi possivel gravar", e);
        }
        LoggOperation.LOGGER.log(Level.INFO, "Serializacao gravado com sucesso em: src/cv/mikusher/agenda/serie/Empregado_{0}.ser", this.p.getId());
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
        func_uuid.setValue(String.valueOf(this.p.getUUID()));
        staff.setAttributeNode(func_uuid);

        // firstname elements
        Element func_name = doc.createElement("Nome");
        func_name.appendChild(doc.createTextNode(this.p.getNome()));
        staff.appendChild(func_name);

        // lastname elements
        Element func_ender = doc.createElement("Endereco");
        func_ender.appendChild(doc.createTextNode(this.p.getEndereco()));
        staff.appendChild(func_ender);

        // nickname elements
        Element func_idade = doc.createElement("Idade");
        func_idade.appendChild(doc.createTextNode(String.valueOf(this.p.getIdade())));
        staff.appendChild(func_idade);

        // salary elements
        Element func_salario = doc.createElement("Salario");
        func_salario.appendChild(doc.createTextNode(String.valueOf(this.p.getSalario())));
        staff.appendChild(func_salario);

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = null;
        try {
            result = new StreamResult(new File(DADOS_EMPREGADO_XML + this.p.getId() + ".xml").getCanonicalPath());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            LoggOperation.LOGGER.log(Level.SEVERE, "Não foi possivel gravar", e);
        }

        // Output to console for testing
        // StreamResult result = new StreamResult(System.out);

        transformer.transform(source, result);

        LoggOperation.LOGGER.info("File xml saved!");
    }





    /**
     * 
     * @param id
     */
    public static void deleteFileUser(Integer id) {

        File deleteXML = new File(DADOS_EMPREGADO_XML + id + ".xml");
        File deleteSER = new File(DADOS_EMPREGADO_SERIAL + id + ".ser");

        try {
            if (deleteSER.exists()) {
                deleteSER.delete();

                if (deleteXML.exists()) {
                    deleteXML.delete();
                }
                LoggOperation.LOGGER.info("File XML and SER delete!");
            } else {
                LoggOperation.LOGGER.info("Delete operation is failed!");
                JOptionPane.showMessageDialog(null, "O id " + id + " nao existe.");
            }

        } catch (HeadlessException e) {
            LoggOperation.LOGGER.warning(e.getMessage());
        }
    }





    /**
     * @param idpesp
     * @param p
     * @return
     */
    public Pessoa pesquisarUtilizador(Object idpesp) {

        this.p.setidPesquisa(Integer.parseInt(idpesp.toString()));

        try {
            try (FileInputStream fileEntrada = new FileInputStream(DADOS_EMPREGADO_SERIAL + this.p.getidPesquisa() + ".ser"); ObjectInputStream inputStream = new ObjectInputStream(fileEntrada)) {
                this.p = (Pessoa) inputStream.readObject();
            }
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "O id " + this.p.getidPesquisa() + " nao existe.", "Funcionario nao existe", JOptionPane.CANCEL_OPTION);
            return null;
        } catch (ClassNotFoundException c) {
            LoggOperation.LOGGER.info("Pessoa nao encontrado");
            return null;
        }
        return this.p;
    }





    public Pessoa checkUtilizador(Object idpesp) {

        this.p.setidPesquisa(Integer.parseInt(idpesp.toString()));

        try {
            try (FileInputStream fileEntrada = new FileInputStream(DADOS_EMPREGADO_SERIAL + this.p.getidPesquisa() + ".ser"); ObjectInputStream inputStream = new ObjectInputStream(fileEntrada)) {
                this.p = (Pessoa) inputStream.readObject();
            }
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "O id " + this.p.getidPesquisa() + " nao existe.", "Funcionario nao existe", JOptionPane.CANCEL_OPTION);
            return null;
        } catch (ClassNotFoundException c) {
            LoggOperation.LOGGER.info("Pessoa nao encontrado");
            return null;
        }
        return this.p;
    }

}

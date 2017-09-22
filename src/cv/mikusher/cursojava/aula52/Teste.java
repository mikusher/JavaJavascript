/*
 * Copyright (C) 2017 Luis Tavares
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.cursojava.aula52;





import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author Luis Tavares
 */
public class Teste {

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {

        // // TODO code application logic here
        // Contato c1 = new Contato();
        // System.out.println(c1);
        //
        // Contato c2 = new Contato();
        // System.out.println(c2);
        //
        // Contato c3 = new Contato();
        // System.out.println(c3);

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;
        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                // consultar contato
                case 1:
                    consultarContato(scan, agenda);
                    break;
                // adicionar contato
                case 2:
                    adicionarContato(scan, agenda);
                    break;
                // termina o programa
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }





    public static void adicionarContato(Scanner scan, Agenda agenda) {

        try {
            System.out.println("Criando um contato: ");
            String nome = lerInformacaoString(scan, "Indica o nome: ");
            String telefone = lerInformacaoString(scan, "Indica o telefone: ");
            String email = lerInformacaoString(scan, "Indica o email: ");

            Contato c = new Contato();
            c.setNome(nome);
            c.setTelefone(telefone);
            c.setEmail(email);
            System.out.println("Contato a ser criado");
            System.out.println(c);

            agenda.adicionarContato(c);
        } catch (AgendaCheiaException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Contatos existentes: ");
            System.out.println(agenda);
        }
    }





    public static void consultarContato(Scanner scan, Agenda agenda) {

        String nomeContato = lerInformacaoString(scan, "Indica o nome a ser pesquisado: ");
        {
            try {
                if (agenda.consultarContatoPorNome(nomeContato) >= 0) {
                    System.out.println("Contato existe");
                }
            } catch (ContatoNaoExistenteException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }





    public static String lerInformacaoString(Scanner scan, String msg) {

        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }





    public static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println("Digita a opção desejada: ");
            System.out.println("1 - Consultar Contato");
            System.out.println("2 - Adicionar Contato");
            System.out.println("3 - Sair");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada Invalida");
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida, digite novamente\n");
            }

        }
        return opcao;
    }

}

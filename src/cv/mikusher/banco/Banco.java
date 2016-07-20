/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.banco;

/**
 *
 * @author Miky Mikusher Wayne
 */

import java.util.Scanner;
import java.util.Calendar;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class Banco
{
   private String nome;
   private Conta carteira[];
   private int numeroContas;
   private Calendar dia;
   private double taxaRemuneracao;
   private Scanner input = new Scanner(System.in);
   private JTextPane guiConsole = new JTextPane();
   
   public Banco(String identificacao, double taxa)
   {
      nome = identificacao;
      carteira = new Conta[100];
      dia = Calendar.getInstance();
      taxaRemuneracao = taxa;
   }
   
   public void log(String msg) 
   {
       Document doc = guiConsole.getDocument();
       try 
       {
           doc.insertString(doc.getLength(), msg + "\r\n", null);
       } catch (BadLocationException e) {}
   }
   
   public void abrir()
   {
      System.out.println("ABERTURA DE CONTA");
      if (numeroContas == 100)
         System.out.println("Não há capacidade para abertura de novas contas");
      else
      {
         System.out.print("Número da nova conta: ");
         int n = input.nextInt();
         for (int i = 0; i < numeroContas; i++)
            if (carteira[i].getNumero() == n)
            {
               System.out.println("conta já existente");
               return;
            }
         
	 System.out.print("Tipo da conta (1: simples, 2: remnuerada): ");
         int tipo = input.nextInt();
	 if (tipo < 1 || tipo > 2)
	 {
	    System.out.println("tipo inválido");
	    return;
	 }
         input.nextLine();
         System.out.print("Titutar da nova conta: ");
         String nome = input.nextLine();
         System.out.print("Saldo inicial da nova conta: ");
         double saldoInicial = input.nextDouble();
	 switch (tipo)
	 {
	 case 1:
	    carteira[numeroContas] = new Conta(n, nome, saldoInicial);
	    break;
	 case 2:
	    carteira[numeroContas] = new ContaRemunerada(n, nome, saldoInicial);
	    break;
	 default:
	    System.out.println("tipo de conta inválido");
	    return;
	 }
         numeroContas ++;
      }
   }
   
   public void consultar()
   {
      System.out.println("CONSULTA");
      System.out.print("Número da conta: ");
      int n = input.nextInt();
      for (int i = 0; i < numeroContas; i++)
         if (carteira[i].getNumero() == n)
	 {
            System.out.println(carteira[i]);
	    return;
	 }
      System.out.println("Conta inválida");
   }
   
   public void depositar()
   {
      System.out.println("DEPÓSITO");
      System.out.print("Número da conta: ");
      int n = input.nextInt();
      for (int i = 0; i < numeroContas; i++)
         if (carteira[i].getNumero() == n)
         {
            System.out.print("Valor do depósito: ");
            double valor = input.nextDouble();
            if (valor <= 0)
               System.out.println(" valor inválido");
            else
               carteira[i].deposito(valor);
            return;
         }
      System.out.println("Conta inválida");
   }
   
   public void sacar()
   {
      System.out.println("SAQUE");
      System.out.print("Número da conta: ");
      int n = input.nextInt();
      for (int i = 0; i < numeroContas; i++)
         if (carteira[i].getNumero() == n)
         {
            System.out.print("Valor do saque: ");
            double valor = input.nextDouble();
            if (valor <= 0)
               System.out.println(" valor inválido");
            else
               carteira[i].saque(valor);
            return;
         }
      System.out.println("Conta inválida");
   }
   
   public void avancarDia()
   {
      dia.add(Calendar.DAY_OF_MONTH, 1);
      // atualizar saldo das contas remuneradas
      for (Conta x : carteira)
	 if (x instanceof ContaRemunerada)
	    x.deposito(x.getSaldo() * taxaRemuneracao);
   }
   
   public void caixaAutomatico()
   {
      int escolha = 9;
      do
      {
         System.out.println("-----------------------------------------");
         System.out.println("Banco " + nome + " - " + dia.getTime());
         System.out.println("Escolha uma opção do menu");
         System.out.println("  1 - Abertura de conta");
         System.out.println("  2 - Consulta");
         System.out.println("  3 - Depósito");
         System.out.println("  4 - Saque");
         System.out.println("  8 - Próximo dia");
         System.out.println("  9 - Sair");
         escolha = input.nextInt();
	 System.out.println();
         switch (escolha)
         {
         case 1:
            abrir();
            break;
         case 2:
            consultar();
            break;
         case 3:
            depositar();
            break;
         case 4:
            sacar();
            break;
         case 8:
            avancarDia();
            break;
         case 9:
            break;
         default:
            System.out.println("opção inválida");
         }
	 System.out.println();
      } while (escolha != 9);
   }
   
   public static void main(String[] args)
   {
      Banco meuBanco = new Banco("CIC101", 0.001);
      meuBanco.caixaAutomatico();
   }
}
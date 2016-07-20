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
public class Conta
{
   private int numero;
   private String titular;
   private double saldo;

   private static int contador;

   public Conta(int num, String nome, double valor)
   {
      numero = num;
      titular = nome;
      if (valor > 0.0)
         saldo = valor;
      contador++;
   }

   public int getNumero()
   {
      return numero;
   }

   public double getSaldo()
   {
      return saldo;
   }

   public void saque(double valor)
   {
      if (valor < 0)
         System.out.println("valor de saque não pode ser negativo");
      else
         if (saldo >= valor)
            saldo = saldo - valor;
         else
            System.out.println("não há saldo suficiente para o saque");
   }

   public void deposito(double valor)
   {
      
      if (valor < 0)
         System.out.println("valor de depósito não pode ser negativo");
      else
         saldo = saldo + valor;
   }

   public String toString()
   {
      return "Número da conta: " + numero +
             ", titular: " + titular +
             ", saldo: " + saldo;
   }

   public static int numeroContas()
   {
      return contador;
   }
}
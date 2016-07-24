/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula15.exercicios;

import java.util.Scanner;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Ex23_CompraDesconto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indique o tipo de carne: ");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int tipo = scan.nextInt();
        
        System.out.println("Indique a quantidade em kg: ");
        double qtd = scan.nextDouble();
        
        double precoKg = 0;
        
        if (tipo == 1){
            System.out.println(qtd+ "kg - file duplo");
            if(qtd < 5){
                precoKg = 4.9;
            } else {
                precoKg = 5.8;
            }
        } else if (tipo == 2){
            System.out.println(qtd+ "kg - alcatra");
            if(qtd < 5){
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }
        } else if (tipo == 3){
            System.out.println(qtd+ "kg - picanha");
            if(qtd < 5){
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
        } 
        double total = qtd * precoKg;
        System.out.println(qtd+ "kg * " +precoKg+ " = " +total);
        
        System.out.println("Compra no cartão? digite 1 para sim: ");
        int cartao = scan.nextInt();
        
        if (cartao == 1){
            double desconto = (total/100) * 5;
            System.out.printf("Desconto de %.2f %n", desconto);
            System.out.println("Valor a pagar :" +(total - desconto));
        } else {
            System.out.printf("Valor a pagar: %.2f %n", total);
        }
    }
}

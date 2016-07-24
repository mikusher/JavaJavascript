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
public class Ex21_CombustivelDesconto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica a quantidade de litros vendido: ");
        double qtdV = scan.nextDouble();
        
        System.out.println("Indica o tipo da gasolina: ");
        String tpg = scan.next();
        
        double precoGsl = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesconto = 0;
        
        if (tpg.equalsIgnoreCase("a")){
            if (qtdV <= 20){
                percDesconto = 3;
            } else{
                percDesconto = 5;
            }
            total = qtdV * precoAlc;
            
        } else if (tpg.equalsIgnoreCase("g")) {
            if (qtdV <= 20){
                percDesconto = 4;
            } else{
                percDesconto = 6;
            }
            total = qtdV * precoGsl;
        }
        totalDesconto = total / 100 * percDesconto;
        double precoAPagar = total - totalDesconto;
        
        System.out.println("Valor a ser pago: " +precoAPagar);
    }
}

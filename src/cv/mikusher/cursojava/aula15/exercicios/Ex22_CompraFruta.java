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
public class Ex22_CompraFruta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica a quantidade (kg) de morango: ");
        double qtdMorango = scan.nextDouble();
        
        System.out.println("Indica a quantidade (kg) de maça: ");
        double qtdMaca = scan.nextDouble();
        
        double precoKgMorango = 0;
        if (qtdMorango <= 5){
            precoKgMorango = 2.5;
        } else {
            precoKgMorango = 2.2;
        }
        
        double precoKgMaca = 0;
        if (qtdMaca <= 5){
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }
        
        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;
        double precoParcial = precoKgMorango + precoKgMaca;
        double precoTotal = precoParcial;
        
        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial/100) * 10);
        }
        System.out.println("Preço Total: " +precoTotal);
    }
}

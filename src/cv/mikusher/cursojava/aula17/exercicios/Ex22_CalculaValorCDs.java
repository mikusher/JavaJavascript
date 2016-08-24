/*
 * Copyright (C) 2016 Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula17.exercicios;

import java.util.Scanner;

/**
 *
 * @author Mikusher
 */
public class Ex22_CalculaValorCDs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica o numero de CD's: ");
        int cds = scan.nextInt();
        
        double preco;
        double soma = 0;
        
        for(int i=1; i<= cds; i++){
            System.out.println("Indica o valor do CD: ");
            preco = scan.nextDouble();
            
            soma = soma + preco;
        }
        double media = soma / cds;
        System.out.println("Media gasta com o CD: " +media);
    }
}
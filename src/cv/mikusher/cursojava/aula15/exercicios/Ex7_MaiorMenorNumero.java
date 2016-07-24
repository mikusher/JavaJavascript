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
public class Ex7_MaiorMenorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int maior, menor;
        
        System.out.print("Indica o 1º numero: ");
        int num1 = scan.nextInt();
        
        System.out.print("Indica o 2º numero: ");
        int num2 = scan.nextInt();
        
        System.out.print("Indica o 3º numero: ");
        int num3 = scan.nextInt();
        
        // Logica para descobrir o maior numero
        if(num1 >= num2 && num1 >= num3){
            maior = num1;
        } else if (num2 >= num3) {
            maior = num2;
        } else {
            maior = num3;
        }
        
        // Logica para descobrir o menor numero
        if(num1 <= num2 && num1 <= num3){
            menor = num1;
        } else if (num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }
        
    System.out.println("");    
    System.out.println("O maior numero é: " +maior);
    System.out.println("O menor numero é: " +menor);
    
    }  
}

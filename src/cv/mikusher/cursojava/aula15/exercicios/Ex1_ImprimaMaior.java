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
public class Ex1_ImprimaMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica o primeiro numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Indica o segundo numero: ");
        int num2 = scan.nextInt();
        
        if(num1>num2){
            System.out.println("O numero " +num1+ " é maior.");
        } else if (num1==num2) {
            System.out.println("Os numero são iguais.");
        } else {
            System.out.println("O numero " +num2+ " é maior.");
        }
    }
    
}

/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula13.exercicios;

import java.util.Scanner;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Ex11_InteirosReais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Indica um numero inteiro: ");
        int numeroInt1 = scan.nextInt();
        System.out.print("Indica um numero inteiro: ");
        int numeroInt2 = scan.nextInt();
        System.out.print("Indica um numero real: ");
        double numeroReal = scan.nextDouble();
        
        
        int valorA = (numeroInt1 * 2) * (numeroInt2 / 2);
        double valorB = ((numeroInt1 * 3) + numeroReal);
        double valorC = (Math.pow(numeroReal, 3));
        
        System.out.println("o valor de A: " +valorA+ "\no valor de B: " +valorB+ "\no valor de C: " +valorC);
    }
    
}

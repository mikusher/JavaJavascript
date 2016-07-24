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
public class Ex16_EquacaoSegundoGrau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Indica o valor de a: ");
        int a = scan.nextInt();
        
        if(a == 0){
            System.out.println("Não é valido para o calculo");
        } else
            
        System.out.print("Indica o valor de b: ");
        int b = scan.nextInt();
        
        System.out.print("Indica o valor de c: ");
        int c = scan.nextInt();
        
        double delta = (Math.pow(b, 2)) - (4*a*c);
        if (delta < 0){
            System.out.println("Delta é negativo");
        } else {
            
            System.out.println("O delta é: " +delta);
            double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
            double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
            
            System.out.printf("x1 = %.2f %n", x1);
            System.out.printf("x2 = %.2f %n", x2);
        }
    }
    
}

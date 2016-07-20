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
public class Ex5_MediaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Indica a Nota 1: ");
        double nota1 = scan.nextDouble();
        
        System.out.print("Indica a Nota 1: ");
        double nota2 = scan.nextDouble();
        
        double mediaFinal = (nota1 + nota2)/2;
        // String md = String.valueOf(mediaFinal);
        
        if(mediaFinal < 7){
            System.out.println("Reprovado");
            
        } else if (mediaFinal == 7 || mediaFinal < 9){
            System.out.println("Aprovado");
            
        } else if (mediaFinal == 10){
            System.out.println("Aprovado com merito");
            
        } else {
            System.out.println("Tente outra vez");
        }
            
    }
    
}

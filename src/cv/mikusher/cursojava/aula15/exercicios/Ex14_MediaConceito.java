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
public class Ex14_MediaConceito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica a primeira nota: ");
        double nota1 = scan.nextDouble();
        
        System.out.println("Indica a segunda nota: ");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2)/2;
        String aproveitamento = "";
        
        if (media >= 9 && media <= 10){
            aproveitamento = "A";        
        } else if (media >= 7.5 && media < 9) {
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5) {
            aproveitamento = "C";
        } else if (media >= 4 && media < 6) {
            aproveitamento = "D";
        }else if (media >= 0 && media < 4) {
            aproveitamento = "E";
        } 
        System.out.println("Nota 1: " +nota1);
        System.out.println("Nota 2: " +nota2);
        System.out.println("Conceito: " +aproveitamento);
        
        switch(aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("Aprovado");
                break;
            case "D":
            case "E":
                System.out.println("Reprovado");
                break;
        }
   }
    
}

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
public class Ex3_LetraDigitada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Indica o M ou F: ");
        String letra = scan.nextLine();
        
        switch(letra) {
            case "m":
            case "M":
                System.out.println("Masculino");
                break;
            case "f":
            case "F":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Sexo, não valido!!");
        }
    }
    
}

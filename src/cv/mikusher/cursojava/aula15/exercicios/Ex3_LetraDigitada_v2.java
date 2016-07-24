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
public class Ex3_LetraDigitada_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Indica o sexo: M ou F: ");
        String sexo = scan.nextLine();
        
        if(sexo.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
            
        } else if (sexo.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
            
        } else {
            System.out.println("Sexo invalido");
        }
    }
}

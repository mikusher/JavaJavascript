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
public class Ex5_ConversorDeMetroParaCentimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
               
        System.out.println("Indica a metro a ser convertido: ");
        double metro = scan.nextDouble();
        double conversor = metro * 100;
        
        System.out.println(metro+ " metro(s) equivale a " +conversor+ " centimetro(s).");
    }
    
}

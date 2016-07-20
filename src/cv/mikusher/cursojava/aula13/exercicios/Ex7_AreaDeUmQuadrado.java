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
public class Ex7_AreaDeUmQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
               
        System.out.print("Indica o tamanho do lado do quadrado: ");
        double valor = scan.nextDouble();
        double area = (Math.pow(valor, 2));
        double dobro = (area * 2);
        
        //System.out.println("Com do raio de " +raio+ " o crirculo tem a area de " +area+ " metros quadrados.");
        System.out.printf("A área do quadrado é %.2f e o seu dobro é %.2f%n", area, dobro);
    }
    
}

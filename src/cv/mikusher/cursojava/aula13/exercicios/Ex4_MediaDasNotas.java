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
public class Ex4_MediaDasNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica as 4 notas, separadas com espaço: ");
        double notas1 = scan.nextDouble();
        double notas2 = scan.nextDouble();
        double notas3 = scan.nextDouble();
        double notas4 = scan.nextDouble();
        
        double media = (notas1+notas2+notas3+notas4)/4;
        
        System.out.println("A media das notas é: " + media);
    }
    
}

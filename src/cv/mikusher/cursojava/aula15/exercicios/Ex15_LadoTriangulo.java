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
public class Ex15_LadoTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Indica o lado 1: ");
        int lado1 = scan.nextInt();
        
        System.out.print("Indica o lado 2: ");
        int lado2 = scan.nextInt();
        
        System.out.print("Indica o lado 3: ");
        int lado3 = scan.nextInt();
        
        if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)){
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triangulo Equilatero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Triangulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triangulo Isóceles");
            }
        } else {
            System.out.println("Não forma um triangulo");
        }
    }
}

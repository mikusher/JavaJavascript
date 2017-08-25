/*
 * Copyright (C) 2016 mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula17.exercicios;

import java.util.Scanner;

/**
 *
 * @author mikusher
 */
public class Ex15_FibonacciTermo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o N da serie de Calculadora: ");
        
        int n = scan.nextInt();
        int primeiro = 1;
        int segundo = 1;
        int proximo;
        
        System.out.println(primeiro);
        System.out.println(segundo);
        
        //1,1,2,3,5
        // primeiro = 1 
        // segundo = 1
        // proximo = 2
        for (int i=3; i<=n; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            System.out.println(proximo);
        }
    }
}

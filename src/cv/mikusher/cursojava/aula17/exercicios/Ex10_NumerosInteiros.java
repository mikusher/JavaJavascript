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
public class Ex10_NumerosInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Indica o primeiro valor: ");
        int numUm = scan.nextInt();
        
        System.out.println("Indica o segundo valor: ");
        int numDois = scan.nextInt();
        
        for(int i=numUm; i<=numDois; i++){
            System.out.println(i);
        }
    }
    
}

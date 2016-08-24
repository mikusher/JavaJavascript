/*
 * Copyright (C) 2016 Mikusher
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
 * @author Mikusher
 */
public class Ex29_NumerosPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica um numero: ");
        int num = scan.nextInt();
        
        for (int i=1; i<= num; i++){
            boolean primo = true;
            
            for(int j=2; j<i; j++){
                if (i % j == 0){
                    primo = false;
                }            
            }
            if (primo){
                System.out.println(i);            
            }                   
        }
    }
}
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
public class Ex28_Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica um numero: ");
        int num = scan.nextInt();
        
        boolean primo = true;
        
        for(int i=2; i<num; i++){
            if (num % i == 0){
                System.out.println("Não é primo - disponivel por " + i);
                primo = false;
            }        
        }
        if (primo){
            System.out.println("É numero primo");
        }
    }
}
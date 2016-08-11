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
public class Ex17_CalcularFatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Indica um numero: ");
        int num = scan.nextInt();
        
        System.out.print(num+ "! = ");
        
        int fatorial = 1;
        for (int i=num; i>0; i--){
            fatorial = fatorial * i;
            System.out.println(i);
        }
        System.out.println("Resultado: " +fatorial);
    }
    
}

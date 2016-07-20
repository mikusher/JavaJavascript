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
public class Ex6_MaiorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Indica o Primeiro numero: ");
        int num1 = scan.nextInt();
        
        System.out.print("Indica o Segundo numero: ");
        int num2 = scan.nextInt();
        
        System.out.print("Indica o Terceiro numero: ");
        int num3 = scan.nextInt();
        
        if(num1>num2 && num1>num3){
            System.out.println("O primeiro numero "+num1+" é o maior");
        } else if (num2>num1 && num2>num3){
            System.out.println("O segundo numero "+num2+" é o maior");
        } else if (num3>num1){
            System.out.println("O terceiro numero "+num3+" é o maior");
        }
    }
    
}

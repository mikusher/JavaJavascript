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
public class Ex20_SuspeitoCrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Telefonou para vitima? ");
        String resp1 = scan.next();
        
        System.out.println("Esteve no local do crime? ");
        String resp2 = scan.next();
        
        System.out.println("Mora perto da vitima? ");
        String resp3 = scan.next();
        
        System.out.println("Já trabalhou com a vitima? ");
        String resp4 = scan.next();
        
        System.out.println("Devia algo para a vitima? ");
        String resp5 = scan.next();
        
        int cont = 0;
        if (resp1.equalsIgnoreCase("S")){
            cont++;
        }
        
        if (resp2.equalsIgnoreCase("S")){
            cont++;
        }
                
        if (resp3.equalsIgnoreCase("S")){
            cont++;
        }
                        
        if (resp4.equalsIgnoreCase("S")){
            cont++;
        }
        
        if (resp5.equalsIgnoreCase("S")){
            cont++;
        }
        
        if (cont == 2){
            System.out.println("Você é suspeito");
        } else if (cont == 3 || cont == 4){
            System.out.println("Você é um cumplice");
        } else if (cont == 5){
            System.out.println("Você é o culpado");
        } else {
            System.out.println("Você é um inocente");
        }
    }
}

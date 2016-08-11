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
public class Ex08_LeiaInfoSomaEMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num;
        int media;
        int soma = 0;
        
        for (int i=0; i<5; i++){
            System.out.println("Indica um numero");
            num = scan.nextInt();
            
            soma = soma + num;
        }
        
        media = soma / 5;
        System.out.println("Soma " +soma);
        System.out.println("Media " +media);
            
    }
    
}

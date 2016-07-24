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

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Ex4_VogalConsoante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String[] vogal = {"a", "e", "i", "o", "u"};
        String[] consoante = {"b", "c", "d", "f", "g", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z", "y"};
                
        System.out.print("Indica a Letra: ");
        String letra = scan.nextLine();

        //verifica se no array se existe a letra indicada!!
        if (Arrays.asList(vogal).contains(letra)){
            System.out.println("É um vogal!!");
            
        } else if (Arrays.asList(consoante).contains(letra)){
            System.out.println("É um consoante");
            
        } else {
            System.out.println("Letra invalida.");
        }       
    }
    
}

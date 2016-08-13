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
public class Ex19_MediaAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o numero de notas: ");
        int numeroNotas = scan.nextInt();
        
        double soma = 0;
        double media;
        double nota;
        
        for (int i= 0; i<numeroNotas; i++){
            System.out.println("Indique a nota: " +(i+1));
            nota = scan.nextDouble();
            
            soma = soma + nota;
        }
        media = soma / numeroNotas;
        
        System.out.println("Soma: " +soma);
        System.out.println("Media " +media);
    }   
}

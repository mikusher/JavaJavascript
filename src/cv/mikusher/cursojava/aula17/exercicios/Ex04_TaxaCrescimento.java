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

/**
 *
 * @author mikusher
 */
public class Ex04_TaxaCrescimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int popula_A = 80000;
        int popula_B = 200000;
        int contador = 0;
        
        while (popula_A <= popula_B){
            popula_A += (popula_A/100) * 3;
            popula_B += (popula_B/100) * 1.5;
            contador++;
        }
        System.out.println("População A: " +popula_A);
        System.out.println("População B: " +popula_B);
        System.out.println("Quantidade de anos: " + contador);
    }
    
}

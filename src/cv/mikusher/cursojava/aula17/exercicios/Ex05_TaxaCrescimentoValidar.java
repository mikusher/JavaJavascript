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
public class Ex05_TaxaCrescimentoValidar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        double populaA;
        double populaB;
        double taxaA;
        double taxaB;
        int contador = 0;
        
        boolean valido = false;
        
        do {
            
            System.out.println("Entre com a população A:");
            populaA = scan.nextDouble();
            
            if(populaA > 0){
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0");
            }
            
        } while (!valido);
        
        valido = false;
        
        do {
            
            System.out.println("Entre com a taxa de crescimento da população A:");
            taxaA = scan.nextDouble();
            
            if(taxaA > 0){
                valido = true;
            } else {
                System.out.println("Taxa de crescimento da população A precisa ser maior que 0");
            }
            
        } while (!valido);
        
        do {
            
            System.out.println("Entre com a população B:");
            populaB = scan.nextDouble();
            
            if(populaB > 0){
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0");
            }
            
        } while (!valido);
        
        do {
            
            System.out.println("Entre com a taxa de crescimento da população B:");
            taxaB = scan.nextDouble();
            
            if(taxaB > 0){
                valido = true;
            } else {
                System.out.println("taxa de crescimento da população B precisa ser maior que 0");
            }
            
        } while (!valido);
        
        
        int count = 0;
        
        while (populaA < populaB){
            populaA += (populaA/100) * taxaA;
            populaB += (populaB/100) * taxaB;
            count++;
        }
        System.out.println("População A: " +populaA);
        System.out.println("População B: " +populaB);
        System.out.println("Quantidade de anos: " + count);
    }
}

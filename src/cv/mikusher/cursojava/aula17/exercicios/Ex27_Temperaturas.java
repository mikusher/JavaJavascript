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
public class Ex27_Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica com a quantidade de temperaturas: ");
        int qtdTemperatura = scan.nextInt();
        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        
        for (int i=1; i<=qtdTemperatura; i++){
            System.out.println("Indica a temperatura " +i); 
            temp = scan.nextDouble();
            
            soma += temp;
            if(temp > maior){
                maior = temp;
            }
            if (temp < menor){
                menor = temp;
            }
        }
        System.out.println("Media: " +(soma/qtdTemperatura));
        System.out.println("Menor Temperatura: " +menor);
        System.out.println("Maior Temperatura: " +maior);
    }
}
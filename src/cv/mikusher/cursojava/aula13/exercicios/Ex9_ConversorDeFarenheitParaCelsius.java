/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */

/***
 * Conversão de	  para:	              Fórmula
grau fahrenheit	  grau Celsius	      °C = (°F - 32)/1,8
grau Celsius	  grau fahrenheit     °F = °C × 1,8 + 32
grau fahrenheit	  kelvin	       K = (°F + 459,67) / 1,8
Kelvin	grau      fahrenheit	      °F = K × 1,8 - 459,67
grau fahrenheit	  Rankine	      °Ra = °F + 459,67
Rankine	grau      fahrenheit	      °F = °Ra - 459,67
grau fahrenheit	  Réaumur	      °Ré = (°F - 32) / 2,25
Réaumur	grau      fahrenheit	      °F = °Ré × 2,25 + 32
 * */

package cv.mikusher.cursojava.aula13.exercicios;

import java.util.Scanner;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Ex9_ConversorDeFarenheitParaCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Indica o valor em Farenheil: ");
        float fare = scan.nextFloat();
        float conversor = (5 * (fare - 32) / 9);
        System.out.printf("%.4fºF equivale a %.4fºC%n", fare, conversor);
    }
    
}

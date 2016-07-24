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
public class Ex11_AumentoSalarial_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
                
        System.out.print("Indica o seu salario: ");
        int percentual = 0;
        double salario = scan.nextDouble();
        
        if (salario <= 280){
            percentual = 20;
        } else if (salario > 280 && salario <= 700){
            percentual = 15;
        } else if (salario > 700 && salario <= 1500){
            percentual = 10;
        } else if (salario > 1500){
            percentual = 5;
        }
        
        double aumento = (salario / 100)*percentual;
        double salarioAjustado = salario + aumento;
        
        System.out.println("Salario inicial: " +salario);
        System.out.println("Porcentual: " +percentual);
        System.out.println("Aumento: " +aumento);
        System.out.println("Salario com ajuste: " +salarioAjustado);
    }
    
}

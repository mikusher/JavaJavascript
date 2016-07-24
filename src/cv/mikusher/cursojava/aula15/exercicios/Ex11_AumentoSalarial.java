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
public class Ex11_AumentoSalarial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double reajuste;
        
        System.out.print("Indica o seu salario: ");
        double salario = scan.nextDouble();
        System.out.println("O salario antes do reajusto: " +salario);
        
        if (salario <= 280){
            System.out.println("Sera aplicado um aumento de 20%");
            reajuste = (salario*8)/100;
            double novoSalario = reajuste + salario;
            System.out.println("Será feito um reajusto de: " +reajuste);
            System.out.println("O novo salario é de: " +novoSalario);
            
        } else if (salario > 280 && salario <= 700){
            System.out.println("Sera aplicado um aumento de 15%");
            reajuste = (salario*15)/100;
            double novoSalario = reajuste + salario;
            System.out.println("Será feito um reajusto de: " +reajuste);
            System.out.println("O novo salario é de: " +novoSalario);
            
        } else if (salario > 700 && salario <= 1500){
            System.out.println("Sera aplicado um aumento de 10%");
            reajuste = (salario*10)/100;
            double novoSalario = reajuste + salario;
            System.out.println("Será feito um reajusto de: " +reajuste);
            System.out.println("O novo salario é de: " +novoSalario);
            
        } else if (salario > 1500){
            System.out.println("Sera aplicado um aumento de 5%");
            reajuste = (salario*5)/100;
            double novoSalario = reajuste + salario;
            System.out.println("Será feito um reajusto de: " +reajuste);
            System.out.println("O novo salario é de: " +novoSalario);
        }    
    }
    
}

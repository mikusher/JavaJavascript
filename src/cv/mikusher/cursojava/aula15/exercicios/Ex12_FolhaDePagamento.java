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
public class Ex12_FolhaDePagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o valor/hora: ");
        double vlHora = scan.nextDouble();
        
        System.out.print("Indica as horas trabalhadas no mês: ");
        double qtHora = scan.nextDouble();
        
        double salarioBruto = vlHora * qtHora;
        int percentualIR = 0;
        
        if (salarioBruto <= 900){
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
            percentualIR = 10;
        } else if (salarioBruto > 2500){
            percentualIR = 20;
        }
        double ir = (salarioBruto/100)*percentualIR;
        double inss = (salarioBruto/100)*10;
        double fgts = (salarioBruto/100)*11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println("------------------------------------------");
        System.out.println("Salario bruto ("+vlHora+" * "+qtHora+"): " +salarioBruto);
        System.out.println("(-) IR (" +percentualIR+ "%: " +ir);
        System.out.println("(-) INSS (10%): " +inss);
        System.out.println("FGTS (11%): " +fgts);
        System.out.println("Total de descontos: " +totalDescontos);
        System.out.println("------------------------------------------");
        System.out.println("Salário Liquido: " +salarioLiquido);
    }
    
}

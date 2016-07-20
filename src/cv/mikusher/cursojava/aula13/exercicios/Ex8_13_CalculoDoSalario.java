/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula13.exercicios;

import java.util.Scanner;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Ex8_13_CalculoDoSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Indica quanto ganhas por hora: ");
        float salarioHora = scan.nextFloat();
        System.out.print("Indica o numero de horas trabalhadas: ");
        float horasTrabalhado = scan.nextFloat();
        System.out.println("---------------------------------------");
        float salarioBruto = (salarioHora * horasTrabalhado);
        
        float impostoDeRenda = (salarioBruto*11)/100;
        float inss = (salarioBruto*8)/100;
        float sindicato = (salarioBruto*5)/100;
        float descontos = (impostoDeRenda + inss + sindicato);
        float salarioLiquido = salarioBruto - descontos;
        System.out.printf("Atualmente em salario bruto recebes: %.2f euro.%n", (salarioBruto));
        System.out.println("---------- Com os Descontos -----------");
        System.out.println("Desconto do Imposto de Renda: " +impostoDeRenda);
        System.out.println("Desconto do INSS: " +inss);
        System.out.println("Desconto do Sindicato: " +sindicato);
        System.out.println("Total de descontos: " +descontos);
        System.out.println("----------------------------------------");
        System.out.printf("Salario liquido: %.2f euro.%n", (salarioLiquido));
        
    }
    
}

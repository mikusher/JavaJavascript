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
public class Ex19_NumerosOperacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica o primeiro numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Indica o segundo numero: ");
        int num2 = scan.nextInt();
        
        System.out.println("Indica a operação (+ - / *): ");
        String opr = scan.next();
        
        double resultado = 0;
        boolean valida = true;
        
        switch(opr){
            case "+": 
                resultado = num1 + num2; 
                break;
            case "-": 
                resultado = num1 - num2; 
                break;
            case "*": 
                resultado = num1 * num2; 
                break;
            case "/": 
                resultado = num1 / num2; 
                break;
            default:
                System.out.println("Operação Invalida");
                valida = false;
        }
        if(valida){
            System.out.println("Resultado: " +resultado);
                if(resultado >= 0){
                    System.out.println("Resultado positivo");
                }else {
                    System.out.println("Resultado negativo");
                }
                if (resultado % 2 == 0){
                    System.out.println("Resultado é PAR");
                } else {
                    System.out.println("Resultado é IMPAR");
                }
        }
    }
}
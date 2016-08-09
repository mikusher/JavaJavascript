/*
 * Copyright (C) 2016 Miky Mikusher Wayne
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


public class Ex01_ValorValido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        //utilizando uma flag de inicialização
        boolean notaValida = false;
        
        do {
            System.out.println("Indica um valor valido de 0 a 10: ");
            double valor = scan.nextDouble();

            if (valor >= 0 && valor <= 10){
                notaValida = true;
                System.out.println("O valor foi: " +valor);
            } else {
                //notaValida = false;
                System.out.println("Valor invalido, digite novamente: ");
                System.out.println("");
            }
        } while (!notaValida);       
    }
}

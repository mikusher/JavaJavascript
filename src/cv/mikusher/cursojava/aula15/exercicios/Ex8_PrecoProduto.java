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
public class Ex8_PrecoProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double menor;
        
        System.out.print("Indica o primeiro preço: ");
        double valor1 = scan.nextDouble();
        
        System.out.print("Indica o segundo preço: ");
        double valor2 = scan.nextDouble();
        
        System.out.print("Indica o terceiro preço: ");
        double valor3 = scan.nextDouble();
        
        // Logica para descobrir o menor numero
        if(valor1 <= valor2 && valor1 <= valor3){
            menor = valor1;
            System.out.println("Compra o de "+menor+" que é o menor valor.");
        } else if (valor2 <= valor3) {
            menor = valor2;
            System.out.println("Compra o de "+menor+" que é o menor valor.");
        } else {
            menor = valor3;
            System.out.println("Compra o de "+menor+" que é o menor valor.");
        }
    }
}

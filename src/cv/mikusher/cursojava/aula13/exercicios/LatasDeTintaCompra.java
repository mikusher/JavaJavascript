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
public class LatasDeTintaCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Metros quadrados a pintar: ");
        int metros = scan.nextInt();
        int latas, valor;
        if (metros % 54 == 0) {
            latas = metros / 54;                        
        } else {
            latas = (metros / 54) + 1;
        }
        valor = latas * 80;
        System.out.println(latas+ " latas a um custo de " +valor);
    }
    
}

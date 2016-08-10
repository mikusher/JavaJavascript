/*
 * Copyright (C) 2016 mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.jogo;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author mikusher
 */
public class J01_AdvinharNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        int numAdvinha = 0;
        int numTentativa = 0;
        int numRandom = random.nextInt(101); // esta no intervalo de {0 - 100}
        
        while (numAdvinha != numRandom) {  
            numTentativa += 1;
            System.out.println(" ");
            System.out.println("Advinha um numero de 0 - 100");
            numAdvinha = scan.nextInt();
            
            if (numAdvinha > numRandom) {
                System.out.println("Numero Alto");
            } else {
                System.out.println("Numero Baixo");
            }
        }
        System.out.println(" ");
        System.out.println("Parabens, voce encontrou o numero " +numRandom+" depois de " +numTentativa+ " tentativas");
    }
}
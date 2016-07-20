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
public class Ex14_CalculoDownload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double tempo;
        
        System.out.print("Indica o tamanho do arquivo em MB: ");
        double mb = scan.nextDouble();
        System.out.print("Indica a velocidade do link em Mbps: ");
        double linkMbps = scan.nextDouble();
        
        tempo = (mb / linkMbps);

        System.out.println("Tempo de download é de " +tempo+ " minutos.");
    }
}

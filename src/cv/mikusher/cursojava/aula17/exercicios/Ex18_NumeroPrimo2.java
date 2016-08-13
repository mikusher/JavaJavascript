/*
 * Copyright (C) 2016 mikusher
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
public class Ex18_NumeroPrimo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Indica o numero para ser validado: ");
        
        int numeroUtilizador = scan.nextInt();
        boolean primo = true;
        
        for(int i=2; i<numeroUtilizador; i++){
            if(numeroUtilizador % i == 0){
                System.out.println("Não é numero primo, divizivel por " +i);
                primo = false;
            }
        }
        if (primo){
            System.out.println("É um numero primo");
        }
    }
}
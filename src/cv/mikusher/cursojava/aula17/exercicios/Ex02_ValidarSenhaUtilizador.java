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


public class Ex02_ValidarSenhaUtilizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean validarInfo = false;
        String utilizador;
        String senha;
        
        do {
            System.out.println("Indica o utilizador: ");
            utilizador = scan.next();
            
            System.out.println("Indica senha: ");
            senha = scan.next();
            
            if (utilizador.equalsIgnoreCase(senha)) {
                validarInfo = false;
                System.out.println("Senha igual ao utilizador, digite novamente.");
            
            } else {
                validarInfo = true;
                System.out.println("Senha e utilizador, valido");
            }

        } while (!validarInfo);
    }
    
}

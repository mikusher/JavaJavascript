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
public class Ex21_MediaAlunoPorTurma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.println("Indica o numero de turmas: ");
        int numeroTurmas = scan.nextInt();
        int numAlunos;
        int soma = 0;
        boolean invalido = true;

        for (int i=1; i<=numeroTurmas; i++) {
            
            invalido = true;
            do {
                System.out.println("Indica o numero de alunos da turma: " + i);
                numAlunos = scan.nextInt();

                if (numAlunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Numero de alunos invalido, digite novamente");
                }
            } while (invalido);
            soma = soma + numAlunos;
        }
        double media = soma / numeroTurmas;       
        System.out.println("Media: " +media);
    }
}

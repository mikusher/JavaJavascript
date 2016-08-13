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
public class Ex20_MediaIdadeTurma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica o numero de alunos: ");
        int numeroIdades = scan.nextInt();
        int idade;
        int soma = 0;
        
        for (int i= 0; i<numeroIdades; i++){
            System.out.println("Indica a idade do individuo: " +(i+1));
            idade = scan.nextInt();
            soma += idade;
        }
        
        double media = soma / numeroIdades;
        System.out.println("Media de idade: " +media);
        
        if(media >= 0 && media <= 25){
            System.out.println("Turma Jovem");
        } else if (media >= 26 && media <= 60){
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }
    }
    
}

/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */

package cv.mikusher.cursojava.aula12;

import java.util.Scanner;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class LeituraDadosTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.next();
        System.out.println("Seu nome completo é " + nomeCompleto);
        
        System.out.println("Digite seu nome primeiro nome: ");
        String primeiroNome = scan.nextLine();
        System.out.println("Seu primeiro nome é " + primeiroNome);
        
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é " + idade);
        */
        System.out.println("Digite seu nome, idade, quantidade de filhos, altura e se tem animal de estimação.");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean animalEstimacao = scan.nextBoolean();
        
        System.out.println("Voce digitou os seguintes dados: ");
        System.out.println("Seu Nome é " + primeiroNome);
        System.out.println("Sua idade é " + idade);
        System.out.println("O numero de filhos " + qtFilhos);
        System.out.println("Sua altura é " + altura);
        System.out.println("Se tens animal de estimação " + animalEstimacao);
    }
    
}

/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula10;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Variaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // convensão Java
        int idade = 28;
        String nome = "Mikusher";
        String nomeDoAnimal = "Boby";
       
        /**
         * 
         * aceito mas não muito utilizado:
         * int _idade;
         * int $idade;
         * 
         * não é convenção Java:
         * String nome_Do_Animal = "Boby";
         * String NomeDoAnimal = "Boby";
         * String nomeDoanimal = "Boby";
         * 
         * ma pratica
         * String a = "Boby";
         * int b = 20;
         * 
         **/
        System.out.println("O seu nome é " +nome+ " e sua idade é " +idade+ " e o seu animal chama-se " +nomeDoAnimal+ ".");
    }
    
}

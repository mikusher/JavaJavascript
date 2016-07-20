/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula13;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class OperadoresCurtoCircuito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro; // faz a verificação dos dois elementos
        boolean resultado2 = falso && verdadeiro; // não faz a verificação dos dois pontos (levando em conta a tabela da verdade &&)
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
    
}

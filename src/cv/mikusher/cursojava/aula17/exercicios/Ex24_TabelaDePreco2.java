/*
 * Copyright (C) 2016 Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula17.exercicios;

/**
 *
 * @author Mikusher
 */
public class Ex24_TabelaDePreco2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Preço do Pão: R$ 0.18");
        System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
        for(int i=1; i<=50; i++){
            System.out.println(i+ " - R$ " +(0.18*i));
        } 
    }
}
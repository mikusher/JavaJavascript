/*
 * Copyright (C) 2016 mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */

package cv.mikusher.softblue.exercicios.WB01;

/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname mikusher
 */
public class WB01_ex04 {

    // M = P * (1 + i)ª
    public static void main(String[] args) {
        
        double montantePrincipal = 5000;
        double taxaDeJuros = 0.01;
        int meses = 12;
        double quadrado = Math.pow(1 + taxaDeJuros, meses);
        
        double montanteFinal = montantePrincipal * quadrado;
        System.out.println("O valor final é: " +montanteFinal);
    }
}

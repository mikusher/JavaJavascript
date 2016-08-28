/*
 * Copyright (C) 2016 mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */

package cv.mikusher.softblue.exercicios.WB02;

/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname mikusher
 */
public class WB02_ex02 {

    public static void main(String[] args) {
        WB02_ex02_Analista fa = new WB02_ex02_Analista("Mikusher", 28);
        fa.setHoras(110);
        fa.setSalario(150);
        fa.setNomeSetor("Informatica");
        fa.mostrarDados();
        
        System.out.println("");
        
        WB02_ex02_Gerente fg = new WB02_ex02_Gerente("Miky", 30);
        fg.setHoras(110);
        fg.setSalario(150);
        fg.setBonus(50);
        fg.mostrarDados();
    }
}

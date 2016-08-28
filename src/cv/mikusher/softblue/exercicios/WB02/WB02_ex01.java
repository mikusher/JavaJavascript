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
public class WB02_ex01 {

    public static void main(String[] args) {
        
        WB02_ex01_Funcionario f3 = new WB02_ex01_Funcionario("Luis", 28);
        f3.setHoras(110);
        f3.setSalario(150);
        f3.mostrarDados();    
    }
}

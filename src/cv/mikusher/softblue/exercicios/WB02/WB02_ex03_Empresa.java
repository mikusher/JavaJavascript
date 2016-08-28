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

import org.apache.log4j.chainsaw.Main;

/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname mikusher
 */
public class WB02_ex03_Empresa {
    
    public static void criarFuncionario(int opcao, String nome, int idade){
        // gerente - 1
        if (opcao == 1) {
            WB02_ex02_Gerente fg = new WB02_ex02_Gerente(nome, idade);
            fg.setSalario(150);
            fg.setHoras(80);
            fg.setBonus(120);
            fg.mostrarDados();
        
        // analista - 2
        } else if (opcao == 2){
            WB02_ex02_Analista fa = new WB02_ex02_Analista(nome, idade);
            fa.setSalario(120);
            fa.setHoras(75);
            fa.setNomeSetor("Informatica");
            fa.mostrarDados();
        }

    }
    public static void main(String[] args) {
        criarFuncionario(1, "Luis", 28);
        System.out.println("");
        criarFuncionario(2, "Tavares", 30);
    }

}

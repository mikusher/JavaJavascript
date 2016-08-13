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

//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mikusher
 */
public class Ex18_NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int divisores = 0, i;
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero natural maior que 0: "));

        for(i = 1; i <= numero; i++){
            if(numero % i == 0){
                divisores += 1;
            }
        }
        if(divisores == 2){
            JOptionPane.showMessageDialog(null, "O número: " +numero+ " é primo");
        }else{
            JOptionPane.showMessageDialog(null, "O número: " +numero+ " não é primo");
        }
    }
}

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
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 1;
        int valor2 = 2;
        
        boolean resultado1 = (valor1==1)&&(valor2==2);
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " +resultado1);
        
        boolean resultado2 = (valor1==1)||(valor2==2);
        System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " +resultado2);
        
        System.out.println("---------------");
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);
        
        
    }
    
}

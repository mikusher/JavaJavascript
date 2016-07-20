/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula11;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class VariaveisChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char o = 'o';
        char i = 'i';
        
        //tambem pode utilizar o assigne da tabela ascii
        char a = 111;
        char b = 105;
        char interrogacao = 63;
        
        System.out.println(o+i);
        System.out.println(""+o+i);
        System.out.println("--------");
        System.out.println(a+b);
        System.out.println(""+a+b+interrogacao);
    }
    
}

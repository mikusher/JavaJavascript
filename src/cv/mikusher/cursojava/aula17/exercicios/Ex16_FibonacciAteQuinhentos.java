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

/**
 *
 * @author mikusher
 */
public class Ex16_FibonacciAteQuinhentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;
        
        System.out.println(primeiro);
        System.out.println(segundo);
        
        while (proximo <= 500){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            System.out.println(proximo);
        }
    }
    
}

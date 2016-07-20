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
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int resultado = 1 + 2;
        System.out.println(resultado);
        
        resultado = resultado * 3;
        System.out.println(resultado);
        
        resultado = resultado - 4;
        System.out.println(resultado);
        
        resultado = resultado / 2;
        System.out.println(resultado);
        
        resultado = resultado % 2;
        System.out.println(resultado);
        
        System.out.println("-------------");
        
        int result = 1;
        
        //mesma coisa que
        System.out.println(++result);
        //resultado = resultado + 1;
        //resultado += 1;
        
        int result2 = 1;
        //mesma coisa que
        System.out.println(result2++);
        //resultado = resultado + 1;
        //resultado += 1;
        
        
    }
    
}

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
public class VariavelCuriosidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int va1 = 2147483647; //o valor maximo da representação de um inteiro levando em conta (-2147483648 ate 2147483647)
        int va2 = 1; //acrescenta mais um numero
        int va3 = va1+va2;
        
        /**
         supostamente isso deveria estourar ou dar um nullPoint :P
         mas o engraçado é que em java os valores funcionam como uma roleta.
         O valor volta para o primeiro negativo da cadeia ou seja -2147483648 */
        System.out.println("O valor é: \n" +va3);
    }
    
}

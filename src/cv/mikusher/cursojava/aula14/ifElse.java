/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula14;

import java.util.Scanner;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class ifElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Indica a sua idade: ");
        int idade = scan.nextInt();
        
        if(idade >= 18){
            System.out.println("É maior de idade!!");
        }else {
            System.out.println("Não é maior de idade!!");
        }
        
    }
    
}

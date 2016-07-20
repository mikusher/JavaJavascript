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
public class MultiploIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica um valor: ");
        double valor = scan.nextDouble();
        if (valor <= 10){
            System.out.println("Pode comprar");
        } else if (valor < 10 && valor > 15){
            System.out.println("Pede um desconto");
        } else if (valor >=15 && valor < 17){
            System.out.println("Pesquisa mais");
        } else {
            System.out.println("Esta muito caro.");
        }
            
    }
    
}

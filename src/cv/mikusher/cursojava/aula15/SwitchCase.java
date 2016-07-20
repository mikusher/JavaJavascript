/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula15;

import java.util.Scanner;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Indica um numero da semana (1-7): ");
        int diaDaSemana = scan.nextInt();
        
        /**
        if (diaDaSemana == 1){
            System.out.println("Domingo");
        } else if (diaDaSemana == 2){
            System.out.println("Segunda");
        } else if (diaDaSemana == 3){
            System.out.println("Terça");
        } else if (diaDaSemana == 4){
            System.out.println("Quarta");
        } else if (diaDaSemana == 5){
            System.out.println("Quinta");
        } else if (diaDaSemana == 6){
            System.out.println("Sexta");
        } else if (diaDaSemana == 7){
            System.out.println("Sabado");
        }  else {
            System.out.println("Não é um dia valido o palhaço!!");
        }
        **/
        
        switch(diaDaSemana){
            case 1: 
                System.out.println("Domingo"); 
            break;
            
            case 2:
                System.out.println("Segunda");
            break;
            
            case 3: 
                System.out.println("Terça");
            break;
            
            case 4:
                System.out.println("Quarta");
            break;
            
            case 5: 
                System.out.println("Quinta");
            break;
            
            case 6:
                System.out.println("Sexta");
            break;
            
            case 7:
                System.out.println("Sabado");
            break;
            
            default: System.out.println("Não é um dia valido o palhaço!!");
        }
    }
    
}

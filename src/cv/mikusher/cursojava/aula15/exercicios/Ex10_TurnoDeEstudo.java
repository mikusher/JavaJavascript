/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula15.exercicios;

import java.util.Scanner;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Ex10_TurnoDeEstudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Indica o horario (M, V ou N): ");
        String turno = scan.next();
        
        switch(turno) {
            case "m":
            case "M":
            case "matutino":
                System.out.println("Bom Dia!");
                break;
            case "v":
            case "V":
            case "vespertino":
                System.out.println("Boa Tarde!");
                break;
            case "n":
            case "N":
            case "noturno":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor invalido!!");
        }
    }
    
}

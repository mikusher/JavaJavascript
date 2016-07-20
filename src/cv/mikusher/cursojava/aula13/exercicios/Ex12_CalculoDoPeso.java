/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula13.exercicios;

import java.util.Scanner;

/**
 *
 * @author Miky Mikusher Wayne
 */
public class Ex12_CalculoDoPeso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Indica a sua altura, (ex: 1,80): ");
        float altura = scan.nextFloat();
        double v = 72.7;
        String s = String.valueOf(v);
        float f = Float.parseFloat(s);
        float ideal = (f*altura)-58;
        
        System.out.printf("De acordo com sua altura %.2f o seu peso ideal seria %.2f kg%n", altura, ideal);
        
       
    }
    
}

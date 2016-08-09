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

import java.util.Scanner;

/**
 *
 * @author mikusher
 */
public class Ex03_ValidarDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean infValido = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        do {
            System.out.println("Indica um nome: ");
            nome = scan.next();
            if(nome.length() > 3){
                infValido = true;
            } else {
                System.out.println("Nome precisa de no minimo 3 caracter");
            }
        } while (!infValido);
        
        
        infValido = false;
        do {
            System.out.println("Indica a idade: ");
            idade = scan.nextInt();
            if(idade >=0 && idade <= 150){
                infValido = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150");
            }
        } while (!infValido);
        
        
        infValido = false;
        do {
            System.out.println("Indica o salario: ");
            salario = scan.nextDouble();
            if(salario > 0){
                infValido = true;
            } else {
                System.out.println("Salario precisa ser maior que 0");
            }
        } while (!infValido);
        
        
        infValido = false;
        do {
            System.out.println("Indica o sexo: ");
            sexo = scan.next();
            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infValido = true;
            } else {
                System.out.println("Sexo precisa ser F ou M");
            }
        } while (!infValido);
        
        
        infValido = false;
        do {
            System.out.println("Indica o estado civil: ");
               estadoCivil = scan.next();
               
            if(estadoCivil.equalsIgnoreCase("c") || 
               estadoCivil.equalsIgnoreCase("s") || 
               estadoCivil.equalsIgnoreCase("v") ||
               estadoCivil.equalsIgnoreCase("d")){
                infValido = true;
            } else {
                System.out.println("Estado civil precisa ser, S, C, V ou D");
            }
        } while (!infValido);
        
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Salario: " +salario);
        System.out.println("Sexo: " +sexo);
        System.out.println("Estado Civil: " +estadoCivil);
    }
    
}

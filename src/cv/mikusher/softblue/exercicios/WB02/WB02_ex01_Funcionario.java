/*
 * Copyright (C) 2016 mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.softblue.exercicios.WB02;

/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname mikusher
 */
public class WB02_ex01_Funcionario {

    private String nome;
    private int idade;
    private double salario;
    private double horas;

    public WB02_ex01_Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public WB02_ex01_Funcionario(String nome) {
        this.nome = nome;
        this.idade = 18;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public double getHoras() {
        return horas;
    }

    public void setSalario(double salario) {
        if (salario < 0 || salario > 200) {
            System.out.println("Valor invalido");
        } else {
            this.salario = salario;
        }
    }

    public void setHoras(double horas) {
        if (horas == 0 || horas > 160) {
            System.out.println("Hora invalida");
        } else {
            this.horas = horas;
        }
    } 
    
    public double calcularSalario(){
    double validar;
        if (this.horas != 0 && this.horas <= 160 || this.salario >= 10 && this.salario <= 200) {
            validar = this.salario * this.horas;
            return validar;
        } else {
            return 0;
        }
    }

    public void mostrarDados() {
        double resultado = calcularSalario();
        if (resultado == 0) {
            System.out.println("Salario de " +this.getNome()+ " não pode ser validado, verifica o valor da hora " +this.getHoras()+ " ou o valor do salario " +this.getSalario());

        } else {
            System.out.println("O funcionario " + this.getNome()+ " com " + this.getIdade() + " anos, possui um salario de " +resultado);
        }
    }
}
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
public class WB02_ex02_Gerente extends WB02_ex01_Funcionario {

    private double bonus;

    public WB02_ex02_Gerente(String nome, int idade) {
        super(nome, idade);
    }

    public WB02_ex02_Gerente(String name) {
        super(name);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        double calculoFinal = ((super.calcularSalario()) + (this.bonus));
        return calculoFinal;
    }

    @Override
    public void mostrarDados() {
        double resultado = calcularSalario();
        if (resultado == 0) {
            System.out.println("Salario de " + this.getNome() + " não pode ser validado, verifica o valor da hora " + this.getHoras() + " ou o valor do salario " + this.getSalario());

        } else {
            System.out.println("O funcionario (Gerente) " +this.getNome()+ " com " +this.getIdade()+ " anos, de idade possui um salario de " +super.calcularSalario()+" acrescentando o bonus o valor final é de " +resultado);
        }
    }

}

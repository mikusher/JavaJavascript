/*
 * Copyright (C) 2017 Miky Mikusher
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.k19.orientacao_a_objecto;





/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

public class Conta {

    int     numero;
    double  saldo;
    double  limite = 100;
    Agencia agencia;





    void deposito(double valor) {

        this.saldo += valor;
    }





    void sacar(double valor) {

        this.saldo -= valor;
    }





    void imprimeExtrato() {

        System.out.println("SALDO: " + this.saldo);
    }





    void imprimeExtrato(int dias) {

        //
    }





    double consultaSaldoDisponivel() {

        return this.saldo + this.limite;
    }

}

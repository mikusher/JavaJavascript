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

public class TesteCenas {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.nome = "Luis Tavares";
        c1.codigo = 1;

        Cliente c2 = new Cliente();
        c2.nome = "Rafael";
        c2.codigo = 2;

        CartaoDeCredito cdc1 = new CartaoDeCredito();
        cdc1.numero = 11212;
        cdc1.dataDeValidade = "10/10/10";

        CartaoDeCredito cdc = new CartaoDeCredito();
        Cliente c = new Cliente();

        // ligando dois objectos
        cdc.cliente = c;

        // acessando o cliente
        cdc.cliente.nome = "Mikusher";

        System.out.println(c1.nome);
        System.out.println(c1.codigo);
        System.out.println(cdc1.numero);
        System.out.println(cdc1.dataDeValidade);
        System.out.println();
        System.out.println(c2.nome);
        System.out.println(c2.codigo);

    }

}

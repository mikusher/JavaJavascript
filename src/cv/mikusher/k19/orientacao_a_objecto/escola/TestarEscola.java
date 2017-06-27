/*
 * Copyright (C) 2017 Miky Mikusher
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.k19.orientacao_a_objecto.escola;





/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

public class TestarEscola {

    public static void main(String[] args) {

        Alunos al = new Alunos();
        Turmas tr = new Turmas();
        Funcionarios fm = new Funcionarios();

        al.turma = tr;

        al.nome = "Mikusher";
        tr.sigla = "UM";

        fm.nome = "Hmtavares";
        fm.salario = 500;
        fm.consultaFuncionario();
        System.out.println("-----");
        fm.aumentarSalario(500);
        fm.consultaFuncionario();
        System.out.println("");
        fm.nome = "Latavares";
        fm.salario = 500;
        fm.consultaFuncionario();
        System.out.println("-----");
        fm.aumentarSalario(500);
        fm.consultaFuncionario();

        // System.out.println(al.nome);
        // System.out.println(al.turma.sigla);

    }

}

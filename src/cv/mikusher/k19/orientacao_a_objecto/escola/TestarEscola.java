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

        Alunos aluno = new Alunos();
        Turmas turma_1 = new Turmas();
        Funcionarios funcionario = new Funcionarios();

        aluno.setTurma(turma_1);

        aluno.setNome("Mikusher");
        turma_1.setSigla("UM");

        funcionario.setNome("Neves");
        funcionario.setSalario(500);
        funcionario.consultaFuncionario();
        
        System.out.println("-----");
        funcionario.aumentarSalario(500);
        funcionario.consultaFuncionario();
        
        System.out.println("");
        
        funcionario.setNome("Latavares");
        funcionario.setSalario(500);
        funcionario.consultaFuncionario();
        
        System.out.println("-----");
        funcionario.aumentarSalario(500);
        funcionario.consultaFuncionario();

        // System.out.println(aluno.nome);
        // System.out.println(aluno.turma.sigla);

    }

}

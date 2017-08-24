package cv.mikusher.cursojava.aula27.exercicios;

import java.util.Scanner;

public class Exec_3 {

	public static void main(String[] args) {

		Aluno2 al = new Aluno2();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Indica o nome do Aluno");
		al.nome = scan.nextLine();

		System.out.println("Indica o numero da matricula do " + al.nome);
		al.matricula = scan.nextLine();

		System.out.println("Indica o nome do curso do aluno " + al.nome + " ");
		al.curso = scan.nextLine();

		for (int i = 0; i < al.disciplinas.length; i++) {
			System.out.println("Indica o nome da disciplina: " + i);
			al.disciplinas[i] = scan.next();
		}

		for (int i = 0; i < al.notasDisciplina.length; i++) {
			System.out.println("Nota da disciplina: " + al.disciplinas[i]);
			for (int j = 0; j < al.notasDisciplina[i].length; j++) {
				System.out.println("Indica a nota " + (j + 1));
				al.notasDisciplina[i][j] = scan.nextDouble();
			}
		}
		al.mostrarInfo();

		for (int i = 0; i < al.disciplinas.length; i++) {
			if (al.verificarAprovado(i)) {
				System.out.println("Disciplina " + al.disciplinas[i] + " Aprovado");
			} else {
				System.out.println("Disciplina " + al.disciplinas[i] + " Reprovado");
			}
		}

	}

}

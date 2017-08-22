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
		al.matricula = scan.nextInt();
		scan.nextLine(); // esse ponto é necessario - Issues with nextLine() [duplicate]

		System.out.println("Indica o nome do curso do aluno " + al.nome + " ");
		al.curso = scan.nextLine();

		for (int i = 0; i < al.disciplinas.length; i++) {
			System.out.println("Indica o nome da " + (i + 1) + " disciplina");
			al.disciplinas[i] = scan.nextLine();
		}

		for (int i = 0; i < al.notasDisciplina.length; i++) {
			System.out.println("Indica o nome da disciplina " + al.disciplinas[i]);
			// al.notasDisciplina[i] = scan.nextDouble();
		}

		al.aproveitamento(al.disciplinas, al.notasDisciplina);

	}

}

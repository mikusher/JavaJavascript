
package cv.mikusher.cursojava.aula27.exercicios;

public class Aluno {

	String nome;
	int matricula;
	String curso;
	String[] disciplinas = new String[3];
	int[] notasDisciplina = new int[3];

	void aproveitamento(String[] disciplina, int[] nota) {

		System.out.println("Curso: " + this.curso);
		System.out.println("Aluno: " + this.nome + " - Matricula: " + this.matricula);

		boolean validadeNota = true;
		for (int i = 0; i < disciplina.length; i++) {
			if (nota[i] > 20 || nota[i] < 0) {
				System.out.println(
						"Valor de nota " + nota[i] + " para a disciplina " + disciplina[i] + " esta incorreta");
				validadeNota = false;
			} else {
				if (nota[i] < 7) {
					System.out.println("Aproveitamento na disciplina " + disciplina[i] + " é Reprovado.");
				} else if (nota[i] == 7) {
					System.out.println(
							"Aproveitamento na disciplina " + disciplina[i] + " é Aprovado, mas precisa estudar mais.");
				} else {
					System.out.println("Aproveitamento na disciplina " + disciplina[i] + " é Aprovado.");
				}
			}
		}
		if (validadeNota) {
			System.out.println("Media: " + media(this.notasDisciplina));
		} else {
			System.out.println("Impossivel calcular a media do aluno");
		}
		System.out.println();
	}

	double media(int[] nota) {
		double _media = 0;
		for (int i = 0; i < nota.length; i++) {
			_media = _media + nota[i];
		}
		return _media / disciplinas.length;
	}

}

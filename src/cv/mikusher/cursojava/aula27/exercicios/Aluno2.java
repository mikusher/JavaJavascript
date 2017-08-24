
package cv.mikusher.cursojava.aula27.exercicios;

public class Aluno2 {

	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[][] notasDisciplina = new double[3][4];

	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do Curso: " + curso);

		for (int i = 0; i < notasDisciplina.length; i++) {
			System.out.println("Notas das disciplinas: " + notasDisciplina[i]);
			for (int j = 0; j < notasDisciplina[i].length; j++) {
				System.out.println(notasDisciplina[i][j] + " ");
			}
			System.out.println();
		}
	}

	boolean verificarAprovado(int index) {
		double soma = 0;
		for (int i = 0; i < notasDisciplina[index].length; i++) {
			soma = soma + notasDisciplina[index][i];
		}

		double media = soma / 4;

		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}
}

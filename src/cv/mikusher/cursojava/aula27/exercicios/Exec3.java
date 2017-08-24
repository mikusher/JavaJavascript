package cv.mikusher.cursojava.aula27.exercicios;

public class Exec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aluno 1
		Aluno al = new Aluno();
		al.nome = "João";
		al.matricula = 1121;
		al.curso = "Informatica";
		al.disciplinas[0] = "Matematica";
		al.disciplinas[1] = "Sistemas";
		al.disciplinas[2] = "Compiladores";
		al.notasDisciplina[0] = 15;
		al.notasDisciplina[1] = 6;
		al.notasDisciplina[2] = -5;
		al.aproveitamento(al.disciplinas, al.notasDisciplina);

		// Aluno 2
		Aluno al2 = new Aluno();
		al2.nome = "Maria";
		al2.matricula = 2542;
		al2.curso = "Contabilidade";
		al2.disciplinas[0] = "Matematica";
		al2.disciplinas[1] = "Calculo";
		al2.disciplinas[2] = "Estatistica";
		al2.notasDisciplina[0] = 14;
		al2.notasDisciplina[1] = 9;
		al2.notasDisciplina[2] = 20;

		al2.aproveitamento(al2.disciplinas, al2.notasDisciplina);

	}

}

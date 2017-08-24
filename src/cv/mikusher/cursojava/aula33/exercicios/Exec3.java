




package cv.mikusher.cursojava.aula33.exercicios;





public class Exec3 {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        // Aluno 1
        Aluno al = new Aluno();
        al.setNome("João");
        al.setMatricula(152421);
        al.setCurso("Informatica");
        al.setDisciplinaPos(0, "Matematica");
        al.setDisciplinaPos(1, "Sistemas");
        al.setDisciplinaPos(2, "Compiladores");
        al.setNotasDisciplinaPos(0, 15);
        al.setNotasDisciplinaPos(1, 6);
        al.setNotasDisciplinaPos(2, -5);
        al.aproveitamento(al.getDisciplinas(), al.getNotasDisciplina());

        // Aluno 2
        Aluno al2 = new Aluno();
        al2.setNome("Maria");
        al2.setMatricula(65326);
        al2.setCurso("Contabilidade");
        al2.setDisciplinaPos(0, "Matematica");
        al2.setDisciplinaPos(1, "Calculo");
        al2.setDisciplinaPos(2, "Estatistica");
        al2.setNotasDisciplinaPos(0, 15);
        al2.setNotasDisciplinaPos(1, 6);
        al2.setNotasDisciplinaPos(2, 18);
        al2.aproveitamento(al2.getDisciplinas(), al2.getNotasDisciplina());

        // Aluno 3
        Aluno al3 = new Aluno("Pedro", 441255, "Gestão");
        al3.setDisciplinaPos(0, "Matematica");
        al3.setDisciplinaPos(1, "Gestão de Recursos");
        al3.setDisciplinaPos(2, "Modalidade");
        al3.setNotasDisciplinaPos(0, 14);
        al3.setNotasDisciplinaPos(1, 6);
        al3.setNotasDisciplinaPos(2, 9);
        al3.aproveitamento(al3.getDisciplinas(), al3.getNotasDisciplina());

    }

}

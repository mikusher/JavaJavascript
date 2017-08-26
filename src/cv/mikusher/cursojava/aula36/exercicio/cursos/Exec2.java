




package cv.mikusher.cursojava.aula36.exercicio.cursos;





import java.util.Scanner;





public class Exec2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        System.out.println("Indica o nome do curso:");
        String nomeC = scan.nextLine();

        System.out.println("Indica o horario do curso:");
        String horarioC = scan.nextLine();

        System.out.println("Indica o nome do Professor:");
        String nomeP = scan.nextLine();

        System.out.println("Indica o Departamento do Professor:");
        String departP = scan.nextLine();

        System.out.println("Indica o email do Professor:");
        String emailP = scan.nextLine();

        // setando dos valores Curso/Professor
        Curso curso = new Curso();
        curso.setNomeCurso(nomeC);
        curso.setHorarioCurso(horarioC);

        Professor professor = new Professor();
        professor.setNome(nomeP);
        professor.setDepartamento(departP);
        professor.setEmail(emailP);

        // colocando professor no curso
        curso.setProfessor(professor);

        // obter alunos e notas
        System.out.println("--- Alunos ---");
        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++) {
            scan.nextLine();
            System.out.println("Indica o nome do aluno " + (i + 1));
            String nomeAluno = scan.nextLine();

            System.out.println("Indica a matricula do " + (i + 1));
            String matriculaAluno = scan.nextLine();

            double[] notas = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("Indica a nota " + (j + 1));
                notas[j] = scan.nextDouble();
            }

            // passar informações do aluno
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }
        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());

    }

}






package cv.mikusher.cursojava.aula43;





public class Teste {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Aluno aluno1 = new Aluno();

        aluno1.setCursos("Computação");
        double[] notasAluno1 = { 10, 7, 9, 4 };
        aluno1.setNotas(notasAluno1);

        Aluno aluno2 = new Aluno();

        aluno2.setCursos("Estatistica");
        double[] notasAluno2 = { 10, 7, 9, 4 };
        aluno2.setNotas(notasAluno2);

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println();
        System.out.println(aluno1.equals(aluno2));
    }

}

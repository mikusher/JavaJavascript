




package cv.mikusher.cursojava.aula27.exercicios;





public class Aluno3 {

    private String     nome;
    private int        matricula;
    private String     curso;
    private String[]   disciplinas     = new String[3];
    private double[][] notasDisciplina = new double[disciplinas.length][4];





    public void aproveitamento(String[] disciplina, double[][] nota) {

        System.out.println("Curso: " + this.curso);
        System.out.println("Aluno: " + this.nome + " - Matricula: " + this.matricula);

        boolean validadeNota = true;
        for (int i = 0; i < disciplina.length; i++) {
            for (int j = 0; j < notasDisciplina[i].length; j++) {
                if (nota[i][j] > 20 || nota[i][j] < 0) {
                    System.out.println("Valor de nota " + nota[i] + " para a disciplina " + disciplina[i] + " esta incorreta");
                    validadeNota = false;
                } else {
                    if (nota[i][j] < 7) {
                        System.out.println("Aproveitamento na disciplina " + disciplina[i] + " é Reprovado.");
                    } else if (nota[i][j] == 7) {
                        System.out.println("Aproveitamento na disciplina " + disciplina[i] + " é Aprovado, mas precisa estudar mais.");
                    } else {
                        System.out.println("Aproveitamento na disciplina " + disciplina[i] + " é Aprovado.");
                    }
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





    double media(double[][] nota) {

        double _media = 0;
        for (int i = 0; i < nota.length; i++) {
            for (int j = 0; j < nota[i].length; j++) {
                _media = _media + nota[i][j];
            }
        }
        return _media / disciplinas.length;
    }

}

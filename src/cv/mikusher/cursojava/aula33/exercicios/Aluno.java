




package cv.mikusher.cursojava.aula33.exercicios;





public class Aluno {

    private String   nome;
    private int      matricula;
    private String   curso;
    private String[] disciplinas;
    private double[] notasDisciplina;





    public Aluno() {

        this.disciplinas = new String[3];
        this.notasDisciplina = new double[3];
    }





    public Aluno(String nome, int matricula, String curso) {

        super();
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notasDisciplina = new double[3];
    }





    public Aluno(String nome, int matricula, String curso, String[] disciplinas, double[] notasDisciplina) {

        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notasDisciplina = notasDisciplina;
        this.disciplinas = new String[3];
        this.notasDisciplina = new double[3];
    }





    public String getNome() {

        return nome;
    }





    public void setNome(String nome) {

        this.nome = nome;
    }





    public int getMatricula() {

        return matricula;
    }





    public void setMatricula(int matricula) {

        this.matricula = matricula;
    }





    public String getCurso() {

        return curso;
    }





    public void setCurso(String curso) {

        this.curso = curso;
    }





    public String[] getDisciplinas() {

        return disciplinas;
    }





    public void setDisciplinas(String[] disciplinas) {

        this.disciplinas = disciplinas;
    }





    public void setDisciplinaPos(int pos, String nomeDisciplina) {

        this.disciplinas[pos] = nomeDisciplina;
    }





    public double[] getNotasDisciplina() {

        return notasDisciplina;
    }





    public void setNotasDisciplina(double[] notasDisciplina) {

        this.notasDisciplina = notasDisciplina;
    }





    public void setNotasDisciplinaPos(int pos, double nota) {

        this.notasDisciplina[pos] = nota;
    }





    public void aproveitamento(String[] disciplina, double[] nota) {

        System.out.println("Curso: " + this.curso);
        System.out.println("Aluno: " + this.nome + " - Matricula: " + this.matricula);

        boolean validadeNota = true;
        for (int i = 0; i < disciplina.length; i++) {
            if (nota[i] > 20 || nota[i] < 0) {
                System.out.println("Valor de nota " + nota[i] + " para a disciplina " + disciplina[i] + " esta incorreta");
                validadeNota = false;
            } else {
                if (nota[i] < 7) {
                    System.out.println("Aproveitamento na disciplina " + disciplina[i] + " é Reprovado.");
                } else if (nota[i] == 7) {
                    System.out.println("Aproveitamento na disciplina " + disciplina[i] + " é Aprovado, mas precisa estudar mais.");
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





    public double media(double[] nota) {

        double _media = 0;
        for (int i = 0; i < nota.length; i++) {
            _media = _media + nota[i];
        }
        return _media / disciplinas.length;
    }

}






package cv.mikusher.cursojava.aula36.exercicio.cursos;





public class Curso {

    private String    nomeCurso;
    private String    horarioCurso;
    private Professor professor;
    private Aluno[]   alunos;





    public String getNomeCurso() {

        return nomeCurso;
    }





    public void setNomeCurso(String nomeCurso) {

        this.nomeCurso = nomeCurso;
    }





    public String getHorarioCurso() {

        return horarioCurso;
    }





    public void setHorarioCurso(String horarioCurso) {

        this.horarioCurso = horarioCurso;
    }





    public Professor getProfessor() {

        return professor;
    }





    public void setProfessor(Professor professor) {

        this.professor = professor;
    }





    public Aluno[] getAlunos() {

        return alunos;
    }





    public void setAlunos(Aluno[] alunos) {

        this.alunos = alunos;
    }





    public String obterInfo() {

        String info = "Curso: " + this.nomeCurso + "\n";
        if (professor != null) {
            info += professor.obterInfo();
        }

        if (alunos != null) {
            System.out.println("----Alunos----");
            for (Aluno aluno : alunos) {
                info += aluno.obterInfo();
                info += "\n";
            }
            info += "\nMedia da Turma: " + obterMediaTurma();
        }
        return info;
    }





    public double obterMediaTurma() {

        double soma = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }
        return soma / alunos.length;
    }
}

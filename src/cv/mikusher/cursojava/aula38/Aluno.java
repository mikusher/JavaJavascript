




package cv.mikusher.cursojava.aula38;





public class Aluno extends Pessoa {

    private String   cursos;
    private String[] notas;





    public Aluno() {

        super();
    }





    public Aluno(String nome, String endereco, String telefone) {

        super(nome, endereco, telefone);
        this.cursos = cursos;
    }





    public String getCursos() {

        return cursos;
    }





    public void setCursos(String cursos) {

        this.cursos = cursos;
    }





    public String[] getNotas() {

        return notas;
    }





    public void setNotas(String[] notas) {

        this.notas = notas;
    }





    public double calcularMedia() {

        return 0;
    }





    public boolean verificarAprovado() {

        return true;
    }





    public void metodoQualquer() {

        this.setCpf("524521523");
        super.getCpf();
    }
}






package cv.mikusher.cursojava.aula41;





public class Aluno extends Pessoa {

    private String   cursos;
    private String[] notas;





    public Aluno() {

        super();
    }





    public Aluno(String nome, String endereco, String telefone) {

        super(nome, endereco, telefone);
        String curso = null;
        this.cursos = curso;
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





    public String obterEtiquetaEndereco() {

        String s = "Endereco do Aluno: ";
        s += super.getEndereco();
        return s;
        // return endereco;
    }





    @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimendo endereco do Professor");
        System.out.println(this.obterEtiquetaEndereco());

    }
}

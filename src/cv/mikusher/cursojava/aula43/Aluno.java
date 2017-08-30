




package cv.mikusher.cursojava.aula43;





import java.util.Arrays;





public class Aluno {

    private String   cursos;
    private double[] notas;





    public Aluno() {

        super();
    }





    public Aluno(String nome, String endereco, String telefone) {

        // super(nome, endereco, telefone);
        String curso = null;
        this.cursos = curso;
    }





    public String getCursos() {

        return cursos;
    }





    public void setCursos(String cursos) {

        this.cursos = cursos;
    }





    public double[] getNotas() {

        return notas;
    }





    public void setNotas(double[] notas) {

        this.notas = notas;
    }





    public double calcularMedia() {

        return 0;
    }





    public boolean verificarAprovado() {

        return true;
    }





    public void metodoQualquer() {

        // this.setCpf("524521523");
        // super.getCpf();
    }





    public String obterEtiquetaEndereco() {

        String s = "Endereco do Aluno: ";
        // s += super.getEndereco();
        return s;
        // return endereco;
    }





    // @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimendo endereco do Professor");
        System.out.println(this.obterEtiquetaEndereco());

    }





    @Override
    public String toString() {

        return "Aluno\nCursos: " + cursos + " \nNotas: " + Arrays.toString(notas);
    }





    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (cursos.equalsIgnoreCase(other.getCursos())) {
            return true;
        }
        return false;
    }

}

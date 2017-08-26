




package cv.mikusher.cursojava.aula36.exercicio.cursos;





public class Aluno {

    private String nomeAluno;
    private String matricula;
    private double notas[];





    public String getNome() {

        return nomeAluno;
    }





    public void setNome(String nome) {

        this.nomeAluno = nome;
    }





    public String getMatricula() {

        return matricula;
    }





    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }





    public double[] getNotas() {

        return notas;
    }





    public void setNotas(double[] notas) {

        this.notas = notas;
    }





    public double media(double[] nota) {

        double _media = 0;
        for (int i = 0; i < nota.length; i++) {
            _media = _media + nota[i];
        }
        return _media / nota.length;
    }





    public String obterInfo() {

        String info = "Nome: " + this.nomeAluno + "; ";
        info += "Matricula: " + this.matricula + "; ";
        info = "Notas: ";

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
            info += nota + " ";
        }
        double media = soma / 4;
        info += "\n" + "Media = " + media + " - ";
        if (media >= 7) {
            info += "Aprovado";
        } else {
            info += "Reprovado";
        }
        return info;
    }





    public double obterMedia() {

        double soma = 0;
        for (double d : notas) {
            soma += d;
        }
        return soma / 4;
    }
}

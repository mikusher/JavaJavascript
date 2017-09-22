package cv.mikusher.cursojava.aula54;

public class Formulario {
    enum Genero{
        FEMININO('F'), MASCULINO('M');
        private char _genero;

        Genero(char genero){
            this._genero = genero;
        }
    }

    private String nome;
    private Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}

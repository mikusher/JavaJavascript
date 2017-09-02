




package cv.mikusher.cursojava.aula43.exercicios.exec3;





public class Mamifero extends Animal {

    // atributos do mamifero
    private String _alimento;





    // construtor do mamifero
    public Mamifero() {

        super();
        this.set_cor("Castanho");
        this._alimento = "Mel";
        this.set_ambiente("Terra");
    }





    public String get_alimento() {

        return _alimento;
    }





    public void set_alimento(String _alimento) {

        this._alimento = _alimento;
    }





    @Override
    public String toString() {

        return super.toString() + "Alimento: " + _alimento + "\n";
    }

}

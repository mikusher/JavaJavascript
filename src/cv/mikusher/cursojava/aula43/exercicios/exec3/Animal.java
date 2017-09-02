




package cv.mikusher.cursojava.aula43.exercicios.exec3;





public class Animal {

    // atributos do animal
    private String _nome;
    private int    _comprimento;
    private int    _patas;
    private String _cor;
    private String _ambiente;
    private double _velocidade;





    // construtor vazio
    public Animal() {}





    // construtor com todos os parametros
    public Animal(String _nome, int _comprimento, String _cor, String _ambiente, double _velocidade) {

        super();
        this._nome = _nome;
        this._comprimento = _comprimento;
        this._patas = 4;
        this._cor = _cor;
        this._ambiente = _ambiente;
        this._velocidade = _velocidade;
    }





    public String get_nome() {

        return _nome;
    }





    public void set_nome(String _nome) {

        this._nome = _nome;
    }





    public int get_comprimento() {

        return _comprimento;
    }





    public void set_comprimento(int _comprimento) {

        this._comprimento = _comprimento;
    }





    public int get_patas() {

        return _patas;
    }





    public void set_patas(int _patas) {

        this._patas = _patas;
    }





    public String get_cor() {

        return _cor;
    }





    public void set_cor(String _cor) {

        this._cor = _cor;
    }





    public String get_ambiente() {

        return _ambiente;
    }





    public void set_ambiente(String _ambiente) {

        this._ambiente = _ambiente;
    }





    public double get_velocidade() {

        return _velocidade;
    }





    public void set_velocidade(double _velocidade) {

        this._velocidade = _velocidade;
    }





    @Override
    public String toString() {

        return "Animal: " + _nome + "\nComprimento: " + _comprimento + " cm" + "\nPatas: " + _patas + "\nCor: " + _cor + "\nAmbiente: " + _ambiente + "\nVelocidade: " + _velocidade + "m/s\n";
    }

}

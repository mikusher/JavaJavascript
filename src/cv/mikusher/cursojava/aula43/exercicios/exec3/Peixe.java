




package cv.mikusher.cursojava.aula43.exercicios.exec3;





public class Peixe extends Animal {

    // atributos do peixe
    private String _caracteristicas;





    // construtor do peixe
    public Peixe() {

        this.set_ambiente("Mar");
        this.set_patas(0);
        this.set_cor("Cinza");
        this._caracteristicas = "Barbatana e cauda";
    }





    public String getCaracteristicas() {

        return _caracteristicas;
    }





    public void setCaracteristicas(String caracteristicas) {

        this._caracteristicas = caracteristicas;
    }





    @Override
    public String toString() {

        return super.toString() + "Caracteristicas: " + _caracteristicas + "\n";
    }

}

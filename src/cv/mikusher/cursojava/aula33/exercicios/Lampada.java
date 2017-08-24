




package cv.mikusher.cursojava.aula33.exercicios;





public class Lampada {

    private int     kw;
    private String  tipo;
    private int     potencia;
    private boolean estado;





    private boolean estadoLampada(boolean estado) {

        this.estado = estado;
        return estado;
    }





    public void mostrarLampada() {

        if (isEstado() == true) {
            System.out.println("Lampada Ligada");
        } else {
            System.out.println("Lampada Desligada");
        }
    }





    public Lampada() {}





    public Lampada(boolean estado) {

        this.estado = estado;
    }





    public int getKw() {

        return kw;
    }





    public void setKw(int kw) {

        this.kw = kw;
    }





    public String getTipo() {

        return tipo;
    }





    public void setTipo(String tipo) {

        this.tipo = tipo;
    }





    public int getPotencia() {

        return potencia;
    }





    public void setPotencia(int potencia) {

        this.potencia = potencia;
    }





    public boolean isEstado() {

        return estado;
    }





    public void setEstado(boolean estado) {

        this.estado = estado;
    }

}

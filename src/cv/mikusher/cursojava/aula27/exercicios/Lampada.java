




package cv.mikusher.cursojava.aula27.exercicios;





public class Lampada {

    int     kw;
    String  tipo;
    int     potencia;
    boolean estado;





    boolean estadoLampada(boolean estado) {

        this.estado = estado;
        return estado;
    }





    void mostrarLampada() {

        if (estado == true) {
            System.out.println("Lampada Ligada");
        } else {
            System.out.println("Lampada Desligada");
        }
    }
}






package cv.mikusher.cursojava.aula34.exercicios;





public class Contador {

    private static int contar = 0;





    public Contador() {

        contar++;
    }





    public static void zerar() {

        contar = 0;
    }





    public static void incrementar() {

        contar++;
    }





    public static int obterValor() {

        return contar;
    }

}

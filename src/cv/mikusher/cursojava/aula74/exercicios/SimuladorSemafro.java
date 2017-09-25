




package cv.mikusher.cursojava.aula74.exercicios;





public class SimuladorSemafro {

    public static void main(String[] args) {

        ThreadSemaforo semafaro = new ThreadSemaforo();
        for (int i = 0; i < 10; i++) {
            System.out.println(semafaro.getCor());
            semafaro.esperaCorMudar();
        }
        semafaro.desligarSemafaro();
    }

}

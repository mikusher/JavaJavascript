package cv.mikusher.cursojava.aula71;

public class Teste {
    public static void main(String[] args) {
        int numeros[] = {2, 32, 4, 5, 2, 9};
        MinhaThreadSoma t1 = new MinhaThreadSoma("#1 ", numeros);
        MinhaThreadSoma t2 = new MinhaThreadSoma("#2 ", numeros);
        MinhaThreadSoma t3 = new MinhaThreadSoma("#3 ", numeros);

        Thread tp1 = new Thread(t3);
        tp1.setPriority(Thread.MAX_PRIORITY);
    }
}

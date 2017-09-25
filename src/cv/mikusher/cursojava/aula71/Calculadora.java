




package cv.mikusher.cursojava.aula71;





public class Calculadora {

    private int soma;





    public synchronized int somaArray(int[] array) {

        soma = 0;
        for (int i = 1; i < array.length; i++) {
            soma += array[i];

            // pegar a thread atual e o nome
            System.out.println("Executando a soma " + Thread.currentThread()
                                                            .getName()
                               + " somando o valor " + array[i] + " com a soma total de " + soma);
            try {
                // aguardar alguns segundos
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return soma;
    }
}

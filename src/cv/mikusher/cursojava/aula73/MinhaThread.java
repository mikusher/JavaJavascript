




package cv.mikusher.cursojava.aula73;





public class MinhaThread implements Runnable {

    private String nome;





    public MinhaThread(String nome) {

        this.nome = nome;
        new Thread(this.nome).start();
    }





    @Override
    public void run() {

        System.out.println("Executando " + this.nome);
        try {
            for (int i = 0; i < 10; i++) {

                System.out.println("Thread " + nome + ", " + i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Terminado " + this.nome);
    }

}

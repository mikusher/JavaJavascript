




package cv.mikusher.cursojava.aula74.exercicios;





public class ThreadSemaforo implements Runnable {

    private CorSemaforo cor;
    private boolean     papar;
    private boolean     corMudou;





    public CorSemaforo getCor() {

        return cor;
    }





    public ThreadSemaforo() {

        this.cor = CorSemaforo.VERMELHO;
        this.papar = false;

        new Thread(this).start();
    }





    @Override
    public void run() {

        while (!papar) {
            try {
                /*
                 * switch (this.cor) {
                 * case VERMELHO:
                 * Thread.sleep(2000);
                 * break;
                 * case AMARELO:
                 * Thread.sleep(300);
                 * break;
                 * case VERDE:
                 * Thread.sleep(1000);
                 * break;
                 * default:
                 * break;
                 * }
                 */

                Thread.sleep(this.cor.getTempo());
                this.mudarCor();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }





    private synchronized void mudarCor() {

        switch (this.cor) {
            case VERMELHO:
                this.cor = CorSemaforo.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemaforo.AMARELO;
                break;
            default:
                break;
        }
        this.corMudou = true;
        notify();
    }





    public synchronized void esperaCorMudar() {

        while (!this.corMudou) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.corMudou = false;
    }





    public synchronized void desligarSemafaro() {

        this.papar = true;
    }
}

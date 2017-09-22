




package cv.mikusher.cursojava.aula69;





public class Teste4 {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable(" - #1", 400);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable(" - #2", 900);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable(" - #3", 300);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Thread finalizados");
    }
}






package cv.mikusher.cursojava.aula70;





import cv.mikusher.cursojava.aula69.MinhaThreadRunnable;





public class Teste {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable(" - #1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable(" - #2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable(" - #3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }

}

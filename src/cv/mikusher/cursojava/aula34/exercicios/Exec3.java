




package cv.mikusher.cursojava.aula34.exercicios;





import java.util.Scanner;





public class Exec3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        do {
            System.out.println("Indica um numero: ");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Numero invalido");
            }
        } while (num < 0);
        System.out.println(Calculadora.fatorial(num));

    }

}

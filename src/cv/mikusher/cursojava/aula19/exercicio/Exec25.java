package cv.mikusher.cursojava.aula19.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Exec25 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        Scanner scan = new Scanner (System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Indica um valor de entrada: ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i]%2==0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }
        System.out.println("O vetor A " + Arrays.toString(vetorA));
        System.out.println("O vetor B " + Arrays.toString(vetorB));
    }

}

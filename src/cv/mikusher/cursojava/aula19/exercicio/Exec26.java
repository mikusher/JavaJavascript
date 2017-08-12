package cv.mikusher.cursojava.aula19.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Exec26 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        
        Scanner scan = new Scanner (System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Indica um valor de entrada A: ");
            vetorA[i] = scan.nextInt();
            
            System.out.print("Indica um valor de entrada B: ");
            vetorB[i] = scan.nextInt();
  
            if (vetorA[i]>vetorB[i]) {
                vetorC[i] = 1;
            } else if(vetorA[i]==vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }
        }
        System.out.println("O vetor A " + Arrays.toString(vetorA));
        System.out.println("O vetor B " + Arrays.toString(vetorB));
        System.out.println("O vetor C " + Arrays.toString(vetorC));
    }

}

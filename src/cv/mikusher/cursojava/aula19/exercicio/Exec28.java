package cv.mikusher.cursojava.aula19.exercicio;

import java.util.Arrays;
import java.util.Scanner;

import org.jfree.util.ArrayUtilities;

public class Exec28 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int tmp = 0;
        
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Indica o valor de A: ");
            vetorA[i] = scan.nextInt();
        }
        
        
        for (int i = 0; i < vetorA.length/2; i++) {
            tmp = vetorA[vetorA.length - i - 1];
            vetorB[vetorA.length -i - 1] = vetorA[i];
            vetorB[i] = tmp;
        }
        
        System.out.println();
        System.out.println("O vetor A " + Arrays.toString(vetorA));
        System.out.println("O vetor B " + Arrays.toString(vetorB));
    }

}

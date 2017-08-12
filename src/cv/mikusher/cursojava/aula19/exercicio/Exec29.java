package cv.mikusher.cursojava.aula19.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Exec29 {

    public static void main(String[] args) {

        int[] containerA = new int[4];
        int[] containerB = new int[containerA.length];
        int[] containerC = new int[containerA.length + containerB.length];
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        
        for (int i = 0; i < containerA.length; i++) {
            System.out.println("Indica o valor do container A: ");
            containerA[i] = scan.nextInt();
            containerC[i] = containerA[i];
            contador++;
        }
        
        for (int j = 0; j < containerB.length; j++) {
            System.out.println("Indica o valor do container B: ");
            containerB[j] = scan.nextInt();
            containerC[contador++] = containerB[j];
        }
        
        System.out.println();
        System.out.println("O vetor A " + Arrays.toString(containerA));
        System.out.println("O vetor B " + Arrays.toString(containerB));
        System.out.println("O vetor C " + Arrays.toString(containerC));
    }
}

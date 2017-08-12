package cv.mikusher.cursojava.aula19.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Exec30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] containerA = new int[4];
        int[] containerB = new int[containerA.length];
        int[] containerC = new int[containerA.length];
        
        for (int i = 0; i < containerC.length; i++) {
            System.out.println("Indica um valor: ");
            containerA[i]= scan.nextInt();
            if (containerA[i]%2==0) {
                containerB[i] = containerA[i];
            } else {
                containerC[i] = containerA[i];
            }
        }
        System.out.println();
        System.out.println("O vetor A " + Arrays.toString(containerA));
        System.out.println("O vetor B Par" + Arrays.toString(containerB).replaceAll("0", "-"));
        System.out.println("O vetor C Impar" + Arrays.toString(containerC).replaceAll("0", "-"));

    }

}

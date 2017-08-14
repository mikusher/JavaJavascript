package cv.mikusher.cursojava.aula19.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Exec27 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];
        
        Scanner scan = new Scanner (System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Indica um valor de entrada: ");
            vetorA[i] = scan.nextInt();
            
            if (vetorA[i]<7) {
                vetorB[i] = 'a';
            } else if(vetorA[i]==7){
                vetorB[i] = 'b';
            } else if(vetorA[i]>7 && vetorA[i]<10){
                vetorB[i] = 'c';
            } else if(vetorA[i]==10){
                vetorB[i] = 'd';
            } else if(vetorA[i]>10){
                vetorB[i] = 'e';
            } 
            
        }
        System.out.println();
        System.out.println("O vetor A " + Arrays.toString(vetorA));
        System.out.println("O vetor B " + Arrays.toString(vetorB));
    }

}

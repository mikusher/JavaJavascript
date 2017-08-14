package cv.mikusher.cursojava.aula19.exercicio;

import java.util.Arrays;
import java.util.Scanner;


//to edit - incomplite
public class Exec31 {

    public static void main(String[] args) {
        int contA[] = new int[3];
        int contB[] = new int[contA.length];
        int contador = 0;
        
        
        
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < contA.length; i++) {
            System.out.println("Indica um valor: ");
            contA[i] = scan.nextInt();
            if (contA[i]%2==0) {
                contB[i] = contA[i];
            } else {
                contA[i] = contA[i];
                contador++;
            }
            contA[contador++] = contB[i];
        }
        System.out.println();
        System.out.println("O vetor A " + Arrays.toString(contA));
        System.out.println("O vetor B " + Arrays.toString(contB));
    }
}
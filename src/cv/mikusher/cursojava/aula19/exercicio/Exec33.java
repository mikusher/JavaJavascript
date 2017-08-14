package cv.mikusher.cursojava.aula19.exercicio;

import java.util.Scanner;

public class Exec33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] valor = new int[10];
        String mensagem;
        
        for (int i = 0; i < valor.length; i++) {
            System.out.print("Indica um valor: ");
            valor[i] = scan.nextInt();
            
            if (valor[i]%2==0) {
                valor[i] = valor[i];
                mensagem = "é primo";
            } else {
                valor[i] = valor[i];
                mensagem = "não é primo";
            }
            System.out.println(valor[i]+" "+mensagem);
            System.out.println();
        }
    }
}
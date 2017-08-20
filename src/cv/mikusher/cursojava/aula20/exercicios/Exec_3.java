package cv.mikusher.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exec_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] numeros = new int[3][3];
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Indica um valor para a posição [" + i + "," + j + "]");
				numeros[i][j] = scan.nextInt();
			}
		}
		// encontrar os pares e impar
		int qntPares = 0;
		int qntInpar = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (numeros[i][j] % 2 == 0) {
					qntPares++;
				} else {
					qntInpar++;
				}
			}
		}
		// para imprimir a matriz
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			// para fazer a quebra na matriz
			System.out.println();
		}
		// imprimir o resultado final dos pares/impar
		System.out.println("Quantidades de Pares: " + qntPares + "\nQuantidade de Impares: " + qntInpar);
	}
}
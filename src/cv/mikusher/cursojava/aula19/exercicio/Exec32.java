package cv.mikusher.cursojava.aula19.exercicio;

import java.util.Scanner;

public class Exec32 {

	public static void main(String[] args) {

		int[] contA = new int[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < contA.length; i++) {
			System.out.print("Indica um novo valor: ");
			contA[i] = scan.nextInt();
		}

		for (int j = 1; j <= 10; j++) {
			for (int i = 0; i < contA.length; i++) {
				System.out.println(contA[i] + " x " + j + " = " + (contA[i] * j));
			}
		}
	}
}

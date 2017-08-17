package cv.mikusher.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] notas = new int[10];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = rnd.nextInt(10);
		}

		for (int numeroNotas : notas) {
			System.out.print(numeroNotas + " ");
		}
	}

}

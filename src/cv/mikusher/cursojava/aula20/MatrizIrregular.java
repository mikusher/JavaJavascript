package cv.mikusher.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Numero de pessoas entrevistadas: ");
		int numEntrevista = scan.nextInt();

		String[][] nomeFilhos = new String[numEntrevista][];

		for (int i = 0; i < nomeFilhos.length; i++) {
			System.out.println("Indica a quantidade de filhos: ");
			int qtdFilhos = scan.nextInt();

			nomeFilhos[i] = new String[qtdFilhos];

			for (int j = 0; j < nomeFilhos[i][j].length(); j++) {
				System.out.println("Indica o nome do filho: " + (j + 1));
				nomeFilhos[i][j] = scan.next();
			}
		}

		for (int i = 0; i < nomeFilhos.length; i++) {
			System.out.println("Pessoa: " + i + " tem " + nomeFilhos[i].length + " filhos");
			for (int j = 0; j < nomeFilhos[i].length; j++) {
				System.out.println(nomeFilhos[i][j]);
			}
		}
	}
}

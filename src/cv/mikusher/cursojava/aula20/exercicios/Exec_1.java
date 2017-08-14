package cv.mikusher.cursojava.aula20.exercicios;

import java.util.Random;

public class Exec_1 {

	public static void main(String[] args) {

		// usando o random para gerar os numeros
		// criando uma matriz de 4 por 4
		Random rnd = new Random();
		int matriz[][] = new int[4][4];

		// iterando a matriz e adicionando os valores
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rnd.nextInt(10);
			}
		}

		// iniciando o ponto para os valores maior/menor - linha/coluna
		int maior = 0;
		int linha = 0;
		int col = 0;

		// verificando os valores da matriz em cada linha/coluna e adicionando ao maior
		// adicionando a posição linha/coluna (i/j) do maior elemento
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					col = j;
				}
			}
		}

		// imprimento a matriz gerada para validar os numeros criados
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// imprimendo o resultado final
		System.out.println();
		System.out.println("Maior Valor: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + col);
	}
}

package cv.mikusher.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exec_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");

		boolean ganhor = false;
		int jogada = 1, linha = 0, coluna = 0;
		char sinal;

		while (!ganhor) {
			if (jogada % 2 == 1) { // jogador 1
				System.out.println();
				System.out.println("Vez do Jogado 1, escolha linha e coluna (1-3)");
				sinal = 'X';
			} else {
				System.out.println();
				System.out.println("Vez do Jogado 2, escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Indica a linha valida (1, 2 e 3)");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("linha invalida");
				}
			}

			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Indica a coluna valida (1, 2 e 3)");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("coluna invalida");
				}
			}

			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posição já usada, tente outra");
			} else {// jogada valida
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}

			// imprimir tabuleiro
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}

			// veficar se existe ganhador
			if (
			// linhas
			(jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')
					|| (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')
					|| (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') ||
					// coluna
					(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')
					|| (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')
					|| (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') ||
					// diagonal
					(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')
					|| (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')) {
				ganhor = true;
				System.out.println("Jogador 1, ganhou");
			} else if (
			// linhas
			(jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')
					|| (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')
					|| (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') ||
					// coluna
					(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')
					|| (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')
					|| (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') ||
					// diagonal
					(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')
					|| (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')) {
				ganhor = true;
				System.out.println("Jogador 2, ganhou");
			} else if (jogada > 9) {
				ganhor = true;
			}
		}
	}
}

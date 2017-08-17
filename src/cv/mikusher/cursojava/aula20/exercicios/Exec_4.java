package cv.mikusher.cursojava.aula20.exercicios;

import java.util.Scanner;

//validar ainda, ainda incompleto
public class Exec_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] compromissos = new String[31][24];

		boolean sair = false;
		int opcao;
		while (!sair) {
			System.out.println("1 - Adicionar Compromisso");
			System.out.println("2 - Verificar Compromisso");
			System.out.println("0 - Sair");

			opcao = scan.nextByte();
			if (opcao == 1) { // add compromisso
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Indica o dia: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia Invalido");
					}
				}

				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println("Indica a hora: ");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Dia Invalido");
					}
				}
				dia--;
				System.out.println("Indica o compromisso: ");
				compromissos[dia][hora] = scan.next();

			} else if (opcao == 2) { // ver compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Indica o dia: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia Invalido");
					}
				}

				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println("Indica a hora: ");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Dia Invalido");
					}
				}

				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[dia][hora]);

			} else if (opcao == 0) {// sair do menu
				sair = true;
			} else {
				System.out.println("Indica um ponto valido\n");
			}
		}

	}

}

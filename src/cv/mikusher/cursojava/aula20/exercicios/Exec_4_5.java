package cv.mikusher.cursojava.aula20.exercicios;

import java.util.Scanner;

//validar ainda, ainda incompleto
public class Exec_4_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][][] compromissos = new String[12][31][8];

		boolean sair = false;
		int opcao;
		while (!sair) {
			System.out.println("1 - Adicionar Compromisso");
			System.out.println("2 - Verificar Compromisso");
			System.out.println("0 - Sair");

			opcao = scan.nextByte();
			if (opcao == 1) { // add compromisso
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Indica o mes: ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mes Invalido");
					}
				}

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
					if (hora > 0 && hora <= 8) {
						horaValido = true;
					} else {
						System.out.println("Dia Invalido");
					}
				}
				mes--;
				dia--;
				System.out.println("Indica o compromisso: ");
				compromissos[mes][dia][hora] = scan.next();

			} else if (opcao == 2) { // ver compromisso

				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Indica o mes: ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mes Invalido");
					}
				}

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

				mes--;
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[mes][dia][hora]);

			} else if (opcao == 0) {// sair do menu
				sair = true;
			} else {
				System.out.println("Indica um ponto valido\n");
			}
		}

	}

}

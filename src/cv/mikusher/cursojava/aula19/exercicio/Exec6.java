/**
 * Copyright (C) 2017, Luis Tavares - 09/08/2017
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */





package cv.mikusher.cursojava.aula19.exercicio;





import java.util.Arrays;
import java.util.Scanner;





/**
 * @description:
 *               tem os exercicios 6, 7, 8 e 9
 * 
 */

public class Exec6 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];
        int[] vetorB = new int[vetorA.length];
        int[] vetorSoma = new int[vetorA.length];
        int[] vetorMultiplica = new int[vetorA.length];
        int[] vetorSubtracao = new int[vetorA.length];
        double[] vetorDivisao = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Indica o valor do vetor A: ");
            vetorA[i] = scan.nextInt();

        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Indica o valor do vetor B: ");
            vetorB[i] = scan.nextInt();

        }

        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }
        for (int j = 0; j < vetorSubtracao.length; j++) {
            vetorSubtracao[j] = vetorA[j] - vetorB[j];
        }
        for (int k = 0; k < vetorMultiplica.length; k++) {
            vetorMultiplica[k] = vetorA[k] * vetorB[k];
        }
        for (int l = 0; l < vetorDivisao.length; l++) {
            vetorDivisao[l] = (vetorA[l] / vetorB[l]);
        }

        System.out.println("O vetor A " + Arrays.toString(vetorA));
        System.out.println("O vetor B " + Arrays.toString(vetorB));
        System.out.println();
        System.out.println("A soma dos Vetores " + Arrays.toString(vetorSoma));
        System.out.println("A subtração dos Vetores " + Arrays.toString(vetorSubtracao));
        System.out.println("A multiplicação dos Vetores " + Arrays.toString(vetorMultiplica));
        System.out.println("A divisão dos Vetores " + Arrays.toString(vetorDivisao));

    }

}

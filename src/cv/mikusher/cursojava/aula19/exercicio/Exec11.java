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
 * 
 */

public class Exec11 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int qpar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Indica um valor para o vetor A: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                qpar++;
                vetorB[i] = vetorA[i];
            }
        }
        scan.close();
        System.out.println("O resultado: " + Arrays.toString(vetorB)
                                                   .replaceAll("0,", ""));
        System.out.println("numero de pares: " + qpar);
    }

}

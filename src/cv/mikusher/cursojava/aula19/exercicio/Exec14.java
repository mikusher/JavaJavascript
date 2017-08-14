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





import java.util.Scanner;





/**
 * @description:
 * 
 */

public class Exec14 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Indica o elemento: ");
            vetorA[i] = scan.nextInt();
        }

        int media = 0, quant = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                media = media + vetorA[i];
                quant++;
            }
        }
        System.out.println();
        System.out.println("O resultado da media é: " + (media / quant));

    }

}

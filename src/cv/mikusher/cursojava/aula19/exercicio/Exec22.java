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

public class Exec22 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (vetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }

            double porc0 = (qtd0 * 100) / vetorA.length;
            double porc1 = (qtd1 * 100) / vetorA.length;
            for (int j = 0; j < vetorA.length; j++) {
                System.out.println(vetorA[i]);
            }
            System.out.println("Porcentagem 0: " + porc0);
            System.out.println("Porcentagem 1: " + porc1);
        }

    }

}

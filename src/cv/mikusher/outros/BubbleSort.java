/**
 * Copyright (C) 2017, Luis Tavares - 08/08/2017
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





package cv.mikusher.outros;





import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;





/**
 * @description:
 * 
 */

public class BubbleSort {

    public static void main(String[] args) {

        int n, c, d, swap;
        Scanner in = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("Indica o numero de valor a ser procurado: ");
        n = in.nextInt();

        int array[] = new int[n];

        // System.out.println("Enter " + n + " integers");
        System.out.println("Random " + n + " integers\n");

        for (c = 0; c < n; c++) {
            // array[c] = in.nextInt();
            array[c] = randomGenerator.nextInt(n);
        }
        System.out.println("Initial integers generate: " + Arrays.toString(array));
        for (c = 0; c < (n - 1); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (array[d] > array[d + 1]) /* For descending order use < */
                {
                    swap = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = swap;
                }
            }
        }

        System.out.println("Sortear numero da lista");

        StringBuilder sb = new StringBuilder();

        for (c = 0; c < n; c++)
            System.out.println(array[c]);
    }
}
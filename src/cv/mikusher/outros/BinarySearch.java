/**
 * Copyright (C) 2017, Luis Tavares - 07/08/2017
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

/**
 * @description:
 * 
 */

import java.util.Scanner;





class BinarySearch {

    public static void main(String args[]) {

        int c, first, last, middle, n, search, array[];
        Random randomGenerator = new Random();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter " + n + " integers");

        for (c = 0; c < n; c++)
            array[c] = randomGenerator.nextInt(n);

        System.out.println("Enter value to find");
        search = in.nextInt();

        first = 0;
        last = n - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            if (array[middle] < search)
                first = middle + 1;
            else if (array[middle] == search) {
                System.out.println(search + " found at location " + (middle + 1) + ".");
                break;
            } else
                last = middle - 1;

            middle = (first + last) / 2;
        }
        if (first > last)
            System.out.println(search + " is not present in the list.\n");
        System.out.println("Auto list generate: " + Arrays.toString(array));
    }
}
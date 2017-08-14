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





/**
 * @description:
 * 
 */

import java.util.Scanner;





public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int x = 10000;
        int[] temp;
        temp = new int[x];
        int bin, dec = 0, pow = 1, count = 0, y = 0;

        System.out.print("Enter Binary Number: ");
        bin = input.nextInt();

        while (bin > 0) {
            temp[count] = bin % 10;
            bin /= 10;
            count++;
            y++;
        }
        count = 0;
        while (count < y) {
            dec += (temp[count] * pow);
            pow *= 2;
            count++;
        }

        System.out.print("In Decimal Form: " + dec);
    }

}
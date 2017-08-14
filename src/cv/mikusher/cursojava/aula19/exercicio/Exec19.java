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

public class Exec19 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] nota1 = new double[5];
        double[] nota2 = new double[nota1.length];
        double[] result = new double[nota1.length];

        for (int i = 0; i < result.length; i++) {
            System.out.println("indica a 1 nota do " + (i + 1) + " aluno.");
            nota1[i] = scan.nextInt();
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("indica a 2 nota do " + (i + 1) + " aluno.");
            nota2[i] = scan.nextInt();
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = (nota1[i] + nota2[i]) / 2;
            if (result[i] >= 7) {
                System.out.println("A media do " + (i + 1) + " aluno é " + result[i] + "\nAprovado\n");
            } else {
                System.out.println("A media do " + (i + 1) + " aluno é " + result[i] + "\nReprovado\n");
            }

        }

    }

}

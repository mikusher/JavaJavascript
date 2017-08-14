/**
 * Copyright (C) 2017, Luis Tavares - 05/08/2017
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





package cv.mikusher.treads;





/**
 * @description:
 * 
 */

public class Teste {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try {
            MinhaThread t1, t2;

            t1 = new MinhaThread(1, 10, 500);
            t2 = new MinhaThread(2, 10, 800);

            System.out.println("Inicio!!");
            t1.start();
            t2.start();
            t1.join();
            System.out.println("Meio!!");
            t2.join();
            System.out.println("Fim!!");
        } catch (Exception e) {
            System.err.println("error...");
            e.printStackTrace();
        }

    }

}

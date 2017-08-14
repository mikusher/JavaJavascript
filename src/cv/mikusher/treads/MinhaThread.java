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

public class MinhaThread extends Thread {

    private int id;
    private int valor;
    private int tempo;





    /**
     * @param id
     * @param valor
     * @param tempo
     */
    public MinhaThread(int id, int valor, int tempo) {

        this.id = id;
        this.valor = valor;
        this.tempo = tempo;
    }





    public void run() {

        try {
            for (int i = 0; i < valor; i++) {
                System.out.println("Thread ID: " + id + " valor: " + i);
                Thread.sleep(tempo);
            }
        } catch (Exception e) {
            System.out.println("Erro na execução: " + e);
        }

    }

}

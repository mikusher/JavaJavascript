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

    
    

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.id;
        hash = 41 * hash + this.valor;
        hash = 41 * hash + this.tempo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MinhaThread other = (MinhaThread) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        if (this.tempo != other.tempo) {
            return false;
        }
        return true;
    }





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
            for (int i = 0; i < getValor(); i++) {
                System.out.println("Thread ID: " + getId() + " valor: " + i);
                Thread.sleep(getTempo());
            }
        } catch (Exception e) {
            System.out.println("Erro na execu��o: " + e);
        }

    }

}

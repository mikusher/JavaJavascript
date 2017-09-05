/*
 * Copyright (C) 2017 latavares - 05/09/2017
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





package cv.mikusher.cursojava.aula46.exercicios;





public class Cubo extends Figura3D {

    private int lado;





    public int getLado() {

        return lado;
    }





    public void setLado(int lado) {

        this.lado = lado;
    }





    @Override
    public double calcularArea() {

        // TODO Auto-generated method stub
        return (6 * Math.pow(lado, 2));
    }





    @Override
    public double calcularVolume() {

        // TODO Auto-generated method stub
        return Math.pow(lado, 3);
    }

}

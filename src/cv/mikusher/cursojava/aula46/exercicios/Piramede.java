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





public class Piramede extends Figura3D {

    private double   altura;
    private double   arestaBase;
    private double   apotema;
    private int      numPoliBase;

    private Figura2D base;





    public int getNumPoliBase() {

        return numPoliBase;
    }





    public void setNumPoliBase(int numPoliBase) {

        this.numPoliBase = numPoliBase;
    }





    public double getAltura() {

        return altura;
    }





    public void setAltura(double altura) {

        this.altura = altura;
    }





    public double getArestaBase() {

        return arestaBase;
    }





    public void setArestaBase(double arestaBase) {

        this.arestaBase = arestaBase;
    }





    public double getApotema() {

        return apotema;
    }





    public void setApotema(double apotema) {

        this.apotema = apotema;
    }





    public Figura2D getBase() {

        return base;
    }





    public void setBase(Figura2D base) {

        this.base = base;
    }





    @Override
    public double calcularArea() {

        if (base != null) {
            return (numPoliBase * ((arestaBase * apotema) / 2)) + base.calcularArea();

        } else {
            return 0;
        }
    }





    @Override
    public double calcularVolume() {

        if (base != null) {
            return (base.calcularArea() * altura) / 3;
        } else {
            return 0;
        }

    }

}

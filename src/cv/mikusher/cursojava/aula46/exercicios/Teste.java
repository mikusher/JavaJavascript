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





public class Teste {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        quadrado.setNome("Quadrado");

        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.setNome("Circulo");

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(3);
        triangulo.setNome("Triangulo");

        Cubo cubo = new Cubo();
        cubo.setLado(3);
        cubo.setNome("Cubo");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(3);
        cilindro.setRaio(2);
        cilindro.setNome("Cilindro");

        Piramede piramede = new Piramede();
        piramede.setAltura(3);
        piramede.setApotema(4);
        piramede.setArestaBase(2);
        piramede.setNumPoliBase(4);
        piramede.setBase(quadrado);
        piramede.setNome("Piramede");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quadrado;
        figuras[1] = circulo;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramede;

        for (FiguraGeometrica figura : figuras) {
            System.out.println("--------------------");
            System.out.println(figura.getNome());

            if (figura instanceof Figura2D) {
                Figura2D f2d = (Figura2D) figura;
                System.out.println("Area: " + f2d.calcularArea());
            }

            if (figura instanceof Figura3D) {
                Figura3D f3d = (Figura3D) figura;
                System.out.println("Area: " + f3d.calcularArea());
                System.out.println("Volume: " + f3d.calcularVolume());
            }

        }
        System.out.println("--------------------");

    }

}

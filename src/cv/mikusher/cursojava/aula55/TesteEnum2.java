package cv.mikusher.cursojava.aula55;

import cv.mikusher.cursojava.aula54.DiaSemana;

public class TesteEnum2 {
    public static void main(String[] args) {


        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);
    }
}






package cv.mikusher.cursojava.aula34.exercicios;





public class Calculadora {

    public static double somar(double val1, double val2) {

        return (val1 + val2);
    }





    public static double subtrair(double val1, double val2) {

        return (val1 - val2);
    }





    public static double multiplicar(double val1, double val2) {

        return (val1 * val2);
    }





    public static double dividir(double val1, double val2) {

        return (val1 / val2);
    }





    public static double potencia(double base, double expoente) {

        if (expoente == 0) {
            return 1;
        } else if (base == 0) {
            return 0;
        } else {
            double total = 1;
            for (int i = 1; i <= expoente; i++) {
                total = total * base;
            }
            return total;
        }
    }





    public static int fatorial(int num) {

        if (num == 0) {
            return 1;
        }

        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }

        return total;
    }

}

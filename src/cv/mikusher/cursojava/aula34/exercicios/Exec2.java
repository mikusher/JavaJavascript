




package cv.mikusher.cursojava.aula34.exercicios;





public class Exec2 {

    static void imprimirResultado(double result) {

        System.out.println(result);
    }





    public static void main(String[] args) {

        // Calculadora.somar(41, 50);
        imprimirResultado(Calculadora.somar(41, 50));
        imprimirResultado(Calculadora.subtrair(41, 50));
        imprimirResultado(Calculadora.multiplicar(41, 50));
        imprimirResultado(Calculadora.dividir(41, 50));
        imprimirResultado(Calculadora.potencia(0, 3));
        imprimirResultado(Calculadora.potencia(2, 0));
        imprimirResultado(Calculadora.potencia(2, 3));

    }

}

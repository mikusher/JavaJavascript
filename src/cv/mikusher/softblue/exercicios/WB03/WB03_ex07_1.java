




package cv.mikusher.softblue.exercicios.WB03;





public class WB03_ex07_1 {

    /*
     * Possibilitar a entrada via console de um conjunto de notas de um aluno. Assim que -1
     * for informado, calcular a m�dia das notas informadas anteriormente e mostrar na tela.
     * Caso a nota do aluno seja inv�lida, mostrar mensagem na tela e solicitar uma nova nota.
     */
    public static void main(String[] args) {

        // qtde de notas fornecidas para o aluno (usada no c�lculo da m�dia)
        int qtdeNotas = 0;

        // acumula a soma das notas
        double somaNotas = 0.0;

        // contador de itera��es
        int i = 1;

        // o loop possui uma condi��o que o torna infinito, mas ele � terminado pela chamada do
        // comando break
        while (true) {
            System.out.print("Nota " + (i++) + ": ");

            // l� a nota do aluno do teclado
            double nota = Console.readDouble();

            // se o valor lido for -1, termina o loop
            if (nota == -1) {
                break;

                // se a nota for menor que 0 ou maior que 10, indica que a nota � inv�lida e reinicia
                // o loop
            } else if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida!");
                continue;
            }

            // acumula o valor da nota na somaNotas
            somaNotas += nota;

            // incrementa a quantidade de notas fornecidas
            qtdeNotas++;

            // reinicia o loop
        }

        // calcula a m�dia, dividindo a soma das notas pela quantidade de notas fornecidas
        double media = somaNotas / qtdeNotas;

        System.out.println("A media e " + media);
    }
}

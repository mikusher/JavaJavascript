




package cv.mikusher.softblue.exercicios.WB03;





public class WB03_ex02_4 {

    public static void main(String[] args) {

        // vari�vel para controlar quantos n�meros j� foram impressos
        int cont = 0;

        // inicia o for com o i valendo 1
        for (int i = 1; cont < 10; i++) {

            // o c�digo if verifica se o resto da divis�o entre i e 9 � 0.
            // caso seja, o n�mero � m�ltiplo de 9 e deve ser impresso
            if (i % 9 == 0) {

                System.out.println("9 x " + (cont + 1) + " = " + i);
                // incrementa a quantidade de n�meros impressos
                cont++;
            }
        }
    }
}

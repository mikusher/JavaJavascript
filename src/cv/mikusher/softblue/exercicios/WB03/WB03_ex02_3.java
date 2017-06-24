




package cv.mikusher.softblue.exercicios.WB03;





public class WB03_ex02_3 {

    public static void main(String[] args) {

        // r acumula o valor da soma para checar se o loop deve parar
        int r = 0;

        // i representa cada itera��o do bloco while
        int i = 0;

        // para checar se a pr�xima itera��o passar� de 100, � necess�rio verificar se a soma de
        // r e i � menor do que 100
        while (r + i < 100) {
            System.out.println(i);

            // r recebe o seu valor somado com i
            r += i;

            // i � incrementado, indicando que esta itera��o terminou
            i++;
        }
    }
}

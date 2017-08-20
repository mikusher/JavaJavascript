




package cv.mikusher.cursojava.aula20.exercicios;





import java.util.Random;





public class Exec_2 {

    public static void main(String[] args) {

        // usando o random para gerar os numeros
        // criando uma matriz de 4 por 4
        Random rnd = new Random();
        int matriz[][] = new int[10][10];

        // iterando a matriz e adicionando os valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
        }
        int maior = 0;
        int menor = 0;
        for (int i = 0; i < matriz[5].length; i++) {
            if (matriz[5][i] > maior) {
                maior = matriz[5][i];
            }
            if (matriz[5][i] < menor) {
                menor = matriz[5][i];
            }
        }
        System.out.println("Maior valor da linha 5 " + maior);
        System.out.println("Menor valor da linha 5 " + menor);

        int maior_coluna7 = 0;
        int menor_coluna7 = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][7] > maior_coluna7) {
                maior_coluna7 = matriz[i][7];
            }
            if (matriz[i][7] < menor_coluna7) {
                menor_coluna7 = matriz[i][7];
            }
        }
        System.out.println("Maior valor da coluna 7 " + maior_coluna7);
        System.out.println("Menor valor da colunaa 7 " + menor_coluna7);
    }
}

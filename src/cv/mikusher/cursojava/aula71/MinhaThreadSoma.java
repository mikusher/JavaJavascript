package cv.mikusher.cursojava.aula71;

public class MinhaThreadSoma implements Runnable{
    private String nome;
    private int[] num;
    private static Calculadora calc = new Calculadora();

    public MinhaThreadSoma(String nome, int[] num) {
        this.nome = nome;
        this.num = num;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciado");
        int soma = calc.somaArray(this.num);
        System.out.println("Resultado da soma para thread "+this.nome+" \u00e9: " +soma);
        System.out.println(this.nome + " terminado");
    }
}

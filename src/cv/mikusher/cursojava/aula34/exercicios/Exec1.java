




package cv.mikusher.cursojava.aula34.exercicios;





public class Exec1 {

    static void imprimirValor() {

        System.out.println(Contador.obterValor());
    }





    public static void main(String[] args) {
        // TODO Auto-generated method stub

        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.zerar();
        imprimirValor();
        Contador c1 = new Contador();
        Contador.incrementar();
        Contador c2 = new Contador();
        imprimirValor();

    }

}

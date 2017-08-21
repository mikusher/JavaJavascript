




package cv.mikusher.cursojava.aula27.exercicios;





public class Exec2 {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        ContaCorrente cc = new ContaCorrente();
        cc.numConta = 1;
        cc.saldo = 1000;
        cc.depositar(500, true);
        cc.saque(1000);
        cc.depositar(2000, false);
        cc.saque(1000);

    }

}

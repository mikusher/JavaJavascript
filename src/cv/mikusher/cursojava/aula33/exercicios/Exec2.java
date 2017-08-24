




package cv.mikusher.cursojava.aula33.exercicios;





public class Exec2 {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        ContaCorrente cc = new ContaCorrente();
        cc.setNumConta(152);
        cc.setSaldo(1000);
        cc.depositar(cc.getSaldo(), true);
        cc.saque(1000);
        cc.depositar(2000, false);
        cc.saque(1000);

        ContaCorrente cc2 = new ContaCorrente(5000);
        cc2.saque(100);

    }

}

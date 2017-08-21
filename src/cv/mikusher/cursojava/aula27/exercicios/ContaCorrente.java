




package cv.mikusher.cursojava.aula27.exercicios;





public class ContaCorrente {

    int     numConta;
    double  saldo;
    boolean cheque;
    double  limite;





    void saque(int quantia) {

        if (quantia > this.saldo) {
            System.out.println("Quantia não disponivel");
        } else {
            this.saldo = this.saldo - quantia;
            System.out.println("Levantamento de " + quantia + "\nSaldo Atual: " + this.saldo);
        }
    }





    void depositar(int quantia, boolean cheque) {

        this.cheque = cheque;
        if (cheque == true) {
            this.saldo = saldo + quantia;
            System.out.println("Deposito de " + quantia + " com cheque especial" + "\nSaldo atual " + saldo);
        } else {
            this.saldo = saldo + quantia;
            System.out.println("Deposito de " + quantia + " sem cheque especial" + "\nSaldo atual " + saldo);
        }
    }

}






package cv.mikusher.cursojava.aula33.exercicios;





public class ContaCorrente {

    int     numConta;
    double  saldo;
    boolean cheque;
    double  limite;





    public ContaCorrente() {}





    public ContaCorrente(double saldo) {

        super();
        this.saldo = saldo;
    }





    public ContaCorrente(int numConta, double saldo, boolean cheque, double limite) {

        super();
        this.numConta = numConta;
        this.saldo = saldo;
        this.cheque = cheque;
        this.limite = limite;
    }





    public int getNumConta() {

        return numConta;
    }





    public void setNumConta(int numConta) {

        this.numConta = numConta;
    }





    public double getSaldo() {

        return saldo;
    }





    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }





    public boolean isCheque() {

        return cheque;
    }





    public void setCheque(boolean cheque) {

        this.cheque = cheque;
    }





    public double getLimite() {

        return limite;
    }





    public void setLimite(double limite) {

        this.limite = limite;
    }





    public void saque(double quantia) {

        if (quantia > getSaldo()) {
            System.out.println("Quantia não disponivel");
        } else {
            setSaldo(getSaldo() - quantia);
            System.out.println("Levantamento de " + quantia + "\nSaldo Atual: " + getSaldo());
        }
    }





    public void depositar(double quantia, boolean cheque) {

        setCheque(cheque);
        if (cheque == true) {
            setSaldo(getSaldo() + quantia);
            System.out.println("Deposito de " + quantia + " com cheque especial" + "\nSaldo atual " + saldo);
        } else {
            setSaldo(getSaldo() + quantia);
            System.out.println("Deposito de " + quantia + " sem cheque especial" + "\nSaldo atual " + saldo);
        }
    }

}

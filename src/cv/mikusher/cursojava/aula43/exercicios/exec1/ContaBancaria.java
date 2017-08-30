




package cv.mikusher.cursojava.aula43.exercicios.exec1;





public class ContaBancaria {

    private String nomeCliente;
    private int    numeroConta;
    private double saldo;





    public ContaBancaria() {}





    public ContaBancaria(String nomeCliente, int numeroConta, double saldo) {

        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }





    public String getNomeCliente() {

        return nomeCliente;
    }





    public void setNomeCliente(String nomeCliente) {

        this.nomeCliente = nomeCliente;
    }





    public int getNumeroConta() {

        return numeroConta;
    }





    public void setNumeroConta(int numeroConta) {

        this.numeroConta = numeroConta;
    }





    public double getSaldo() {

        return saldo;
    }





    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }





    public boolean sacar(double quantiaSaque) {

        if (quantiaSaque > saldo) {
            System.out.println("Nao possui essa quantia no banco");
            return false;
        } else if ((saldo - quantiaSaque) <= 0) {
            System.out.println("Não pode levantar essa quantia, seu saldo fica negativo");
            return false;
        } else {
            saldo = saldo - quantiaSaque;
            return true;
        }
    }





    public void depositar(double quantiaDeposito) {

        saldo += quantiaDeposito;
    }





    @Override
    public String toString() {

        return "ContaBancaria:\nCliente: " + nomeCliente + " \nNumero da Conta: " + numeroConta + "\nSaldo: " + saldo;
    }

}

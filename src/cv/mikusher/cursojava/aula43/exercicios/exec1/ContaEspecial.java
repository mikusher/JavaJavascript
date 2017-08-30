




package cv.mikusher.cursojava.aula43.exercicios.exec1;





public class ContaEspecial extends ContaBancaria {

    private double limite;





    public boolean sacar(double quantiaSaque) {

        double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite - quantiaSaque) >= 0) {
            this.setSaldo(this.getSaldo() - quantiaSaque);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }





    public double getLimite() {

        return limite;
    }





    public void setLimite(double limite) {

        this.limite = limite;
    }





    @Override
    public String toString() {

        return "Conta Especial\nLimite: " + limite + "\n" + super.toString();
    }
}

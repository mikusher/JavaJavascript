




package cv.mikusher.cursojava.aula43.exercicios.exec1;





import java.util.Calendar;





public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;





    public ContaPoupanca() {

        super();
    }





    public boolean calculaNovoSaldo(double taxaRendimento) {

        Calendar diaHoje = Calendar.getInstance();
        if (diaRendimento == diaHoje.get(Calendar.DAY_OF_MONTH)) {
            double saldoConta = super.getSaldo();
            double tFinal = saldoConta * taxaRendimento;
            this.setSaldo(saldoConta + tFinal);
            return true;
        }
        return false;
    }





    public int getDiaRendimento() {

        return diaRendimento;
    }





    public void setDiaRendimento(int diaRendimento) {

        this.diaRendimento = diaRendimento;
    }





    @Override
    public String toString() {

        return "Conta Poupanca\nDia de Rendimento: " + diaRendimento + "\n" + super.toString();
    }

}






package cv.mikusher.cursojava.aula43.exercicios.exec2;





public class PessoaJuridica extends Contribuinte {

    private String cnpj;





    public String getCnpj() {

        return cnpj;
    }





    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }





    @Override
    public double calcularImposto() {

        return (this.getRendaBruta() / 100) * 10;
    }





    @Override
    public String toString() {

        return super.toString() + "\n" + "Pessoa Juridica - CNPJ[" + cnpj + "]" + "\nImposto a ser pago: " + calcularImposto();

    }

}

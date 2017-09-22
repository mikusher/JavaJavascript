




package cv.mikusher.cursojava.aula36;





public class Contato {

    private String     nome;
    private Endereco   endereco;
    private Telefone[] telefones;





    public Contato() {
        // TODO Auto-generated constructor stub
    }





    public Contato(String nome, String endereco, String string) {
        // TODO Auto-generated constructor stub
    }





    public String getNome() {

        return nome;
    }





    public void setNome(String nome) {

        this.nome = nome;
    }





    public Endereco getEndereco() {

        return endereco;
    }





    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;
    }





    public Telefone[] getTelefones() {

        return telefones;
    }





    public void setTelefones(Telefone[] telefones) {

        this.telefones = telefones;
    }
}

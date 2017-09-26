




package cv.mikusher.cursojava.aula75;





public class Pessoa {

    private String nome;
    private int    id, idade;





    public String getNome() {

        return nome;
    }





    public void setNome(String nome) {

        this.nome = nome;
    }





    public int getId() {

        return id;
    }





    public void setId(int id) {

        this.id = id;
    }





    public int getIdade() {

        return idade;
    }





    public void setIdade(int idade) {

        this.idade = idade;
    }





    public Pessoa(int id, String nome, int idade) {

        super();
        this.nome = nome;
        this.id = id;
        this.idade = idade;
    }





    public Pessoa() {

        super();
        // TODO Auto-generated constructor stub
    }





    @Override
    public String toString() {

        return "Pessoa:\nNome: " + nome + ", Id: " + id + ", Idade: " + idade;
    }

}

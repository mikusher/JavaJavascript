




package cv.mikusher.cursojava.aula36.exercicio.agenda;





public class Agenda {

    private String    nome;
    private Contato[] contatos;





    public Agenda() {}





    public Agenda(String nome) {

        this.nome = nome;
    }





    public String getNome() {

        return nome;
    }





    public void setNome(String nome) {

        this.nome = nome;
    }





    public Contato[] getContato() {

        return contatos;
    }





    public void setContato(Contato[] contato) {

        this.contatos = contato;
    }





    public String obterInfo() {

        String info = "Nome Agenda: " + this.nome + "\n";

        if (contatos != null) {
            for (Contato ct : contatos) {
                info += ct.obterInfo() + "\n";
            }
        }
        return info;
    }
}

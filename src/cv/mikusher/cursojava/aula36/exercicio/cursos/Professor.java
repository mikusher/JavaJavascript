




package cv.mikusher.cursojava.aula36.exercicio.cursos;





public class Professor {

    private String nomeProfessor;
    private String departamento;
    private String email;





    public String getNome() {

        return nomeProfessor;
    }





    public void setNome(String nome) {

        this.nomeProfessor = nome;
    }





    public String getDepartamento() {

        return departamento;
    }





    public void setDepartamento(String departamento) {

        this.departamento = departamento;
    }





    public String getEmail() {

        return email;
    }





    public void setEmail(String email) {

        this.email = email;
    }





    public String obterInfo() {

        return "Professor: " + this.nomeProfessor + "\n";
    }

}

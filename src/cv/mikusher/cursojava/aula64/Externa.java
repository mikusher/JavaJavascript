




package cv.mikusher.cursojava.aula64;





public class Externa {

    private String texto = "texto externo";





    public class Interna {

        private String texto = "texto interno";





        public void imprimiTexto() {

            System.out.println(texto);

            System.out.println(Externa.this.texto);
        }
    }





    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Externa externa = new Externa();
        Interna interna = externa.new Interna();

        interna.imprimiTexto();

    }

}

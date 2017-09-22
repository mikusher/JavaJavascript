




package cv.mikusher.cursojava.aula64;





public class Externa2 {

    public void metodoQualquer() {

        class ClassLocal {

            private String texto = "texto class local";





            public void imprimeTexto() {

                System.out.println(texto);
            }
        }
        ClassLocal local = new ClassLocal();

        local.imprimeTexto();
    }





    public static void main(String[] args) {

        Externa2 externa = new Externa2();
        externa.metodoQualquer();

    }

}

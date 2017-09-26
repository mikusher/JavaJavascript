




package cv.mikusher.cursojava.aula75;





// split & join

public class Aula82 {

    public static void main(String[] args) {

        String alfabeto = String.join(", ", "A", "B", "C", "D");

        System.out.println(alfabeto);

        String[] letras = alfabeto.split(", ");
        for (String letra : letras) {
            System.out.println(letra);
        }

        System.out.println();
        String doArquivo = "1;Antônio;30";
        System.out.println(doArquivo);
        System.out.println();
        String[] infos = doArquivo.split(";");

        for (String rows : infos) {
            System.out.println(rows);
        }

        System.out.println();

        Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
        System.out.println(pessoa);
    }
}

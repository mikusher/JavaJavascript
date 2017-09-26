




package cv.mikusher.cursojava.aula75;





public class Aula80 {

    public static void main(String[] args) {

        String teste = "Teste de String";
        System.out.println(teste);

        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 13));

        String espacos = "i s p a ç o";
        String semEspaco = espacos.replace('i', 'E');
        System.out.println(semEspaco.toLowerCase());

        semEspaco = semEspaco.replaceAll(" ", "");
        System.out.println(semEspaco);

        String nome = " Miky Mikusher ";
        System.out.println(nome);
        System.out.println(nome.trim().toUpperCase());

    }

}

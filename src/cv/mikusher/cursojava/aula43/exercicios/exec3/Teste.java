




package cv.mikusher.cursojava.aula43.exercicios.exec3;





public class Teste {

    public static void main(String[] args) {

        // animal - camelo
        Animal camelo = new Animal("Camelo", 150, "Amarelo", "Terra", 2);

        // peixe - tubarão
        Peixe tubarao = new Peixe();
        tubarao.set_nome("Tubarão");
        tubarao.set_comprimento(300);
        tubarao.set_velocidade(1.5);

        // mamifero - urso
        Mamifero urso = new Mamifero();
        urso.set_nome("Urso do Canada");
        urso.set_comprimento(180);
        urso.set_cor("Vermelho");
        urso.set_velocidade(0.5);

        // colocando em um array
        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        // imprimindo o array
        System.out.println("--------------------------------------");
        for (Animal animal : animais) {
            System.out.println(animal.toString());
            System.out.println("--------------------------------------");
        }

    }

}






package cv.mikusher.cursojava.aula36.exercicio.agenda;





import java.util.Scanner;





public class Exec1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Indica o nome da Agenda:");
        String nomeAgenda = scan.nextLine();
        Agenda agenda = new Agenda(nomeAgenda);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Indica as onformações do contato " + (i + 1));
            Contato c = new Contato();
            System.out.println("Indica o Nome: ");
            String nome = scan.nextLine();
            c.setNome(nome);
            System.out.println("Indica o Telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);
            System.out.println("Indica o Email: ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }
        agenda.setContato(contatos);
        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }

    }

}

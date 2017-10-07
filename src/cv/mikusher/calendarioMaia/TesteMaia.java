




package cv.mikusher.calendarioMaia;





import java.util.Arrays;





public class TesteMaia {

    public static void main(String[] args) {

        final int dia = 36;
        Dia d = new Dia();
        System.out.println("Domingo: " + Arrays.toString(d.getDomingo()));
        System.out.println("Segunda: " + Arrays.toString(d.getSegunda()));
        System.out.println("Terça: " + Arrays.toString(d.getTerca()));
        System.out.println("Quarta: " + Arrays.toString(d.getQuarta()));
        System.out.println("Quinta: " + Arrays.toString(d.getQuinta()));
        System.out.println("Sexta: " + Arrays.toString(d.getSexta()));
        System.out.println("Sabado: " + Arrays.toString(d.getSabado()));
        System.out.println("\nMeu dia de semana escolhido é " + dia + " em semana é " + d.Dia(dia)
                                                                                         .toString());

    }

}

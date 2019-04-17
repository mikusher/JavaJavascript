




package cv.mikusher.calendarioMaia;





import java.util.Arrays;





public class TesteMaia {

    public static void main(String[] args) {

        final int dia = 36;
        Dia _dia = new Dia();
        System.out.println("Domingo: " + Arrays.toString(_dia.getDomingo()));
        System.out.println("Segunda: " + Arrays.toString(_dia.getSegunda()));
        System.out.println("Terca: " + Arrays.toString(_dia.getTerca()));
        System.out.println("Quarta: " + Arrays.toString(_dia.getQuarta()));
        System.out.println("Quinta: " + Arrays.toString(_dia.getQuinta()));
        System.out.println("Sexta: " + Arrays.toString(_dia.getSexta()));
        System.out.println("Sabado: " + Arrays.toString(_dia.getSabado()));
        System.out.println("\nMeu dia de semana escolhido foi " + dia + " em semana " + _dia.Dia(dia));

    }

}

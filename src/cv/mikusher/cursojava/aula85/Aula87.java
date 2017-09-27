




package cv.mikusher.cursojava.aula85;





import java.util.Calendar;





public class Aula87 {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance(); // singleton

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);

        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minuto = hoje.get(Calendar.MINUTE);
        int segundo = hoje.get(Calendar.SECOND);

        // System.out.println(dia + "/" + mes + "/" + ano);

        System.out.printf("Hoje é: %02d/%02d/%d", dia, (mes + 1), ano);
        System.out.printf(" - %02d:%02d:%02d", hora, minuto, segundo);

    }

}

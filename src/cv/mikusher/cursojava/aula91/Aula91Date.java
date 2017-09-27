




package cv.mikusher.cursojava.aula91;





import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;





public class Aula91Date {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        String hojeFormatado = DateFormat.getInstance()
                                         .format(hoje);
        System.out.println(hojeFormatado);

        // Locale.setDefault(new Locale("en", "US"));

        hojeFormatado = DateFormat.getInstance()
                                  .format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance()
                                  .format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT)
                                  .format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM)
                                  .format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG)
                                  .format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT)
                                  .format(hoje);
        System.out.println(hojeFormatado);

        ///
        String data = "19-01-1988 19:23";
        try {
            Date dataDate = DateFormat.getInstance()
                                      .parse(data);
            System.out.println(dataDate);
            //
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dataDate);
            System.out.println(calendario);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

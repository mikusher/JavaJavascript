




package cv.mikusher.cursojava.aula85;





import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;





// formatar datas

public class Aula89 {

    public static void main(String[] args) {

        Date hoje = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss z Z");

        Calendar data = new GregorianCalendar(2017, 8, 20, 15, 16, 20);

        System.out.println(sdf.format(data.getTime()));
        System.out.println(sdf.format(hoje));

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "19/01/1988";

        try {
            System.out.println();
            Date minhaDataForm = sdf2.parse(minhaData);
            System.out.println(sdf.format(minhaDataForm));

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}






package cv.mikusher.cursojava.aula90;





import java.text.NumberFormat;
import java.util.Locale;





public class Aula90Locale {

    public static void main(String[] args) {

        Locale local = Locale.getDefault();

        System.out.println(local);
        System.out.println(local.getLanguage());
        System.out.println(local.getCountry());
        System.out.println(local.getVariant());

        System.out.println();

        Locale[] locais = Locale.getAvailableLocales();
        for (Locale _rowslocale : locais) {
            System.out.println("Pais " + _rowslocale.getDisplayCountry() + " - Cod: " + _rowslocale.getLanguage() + " - Lingua: " + _rowslocale.getDisplayLanguage());
            System.out.println("-------------------------");
        }

        System.out.println();
        Locale cv = new Locale("cv");
        Locale.setDefault(cv);

        System.out.println(Locale.getDefault());
        NumberFormat nf = NumberFormat.getCurrencyInstance(local.ITALY);
        System.out.println(nf.format(54521523652d));

    }

}

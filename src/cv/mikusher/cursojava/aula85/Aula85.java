




package cv.mikusher.cursojava.aula85;





import static java.lang.Math.pow;

import java.math.BigDecimal;





public class Aula85 {

    public static void main(String[] args) {

        System.out.println(pow(2, 3));

        System.out.println(Math.round(2.3));
        System.out.println(Math.round(4.4));

        System.out.println("using ceil");
        System.out.println(Math.ceil(2.3));
        System.out.println(Math.ceil(4.4));

        System.out.println("using foor");
        System.out.println(Math.floor(2.3));
        System.out.println(Math.floor(4.4));

        System.out.println(Math.round(Math.random() * 10));

        // sin - cos

        final double _cos = Math.cos(Math.toRadians(1));

        System.out.println(Math.sin(Math.toRadians(30)));
        System.out.println(Math.cos(Math.toRadians(1)));
        System.out.println(Math.tan(Math.toRadians(45)));

        BigDecimal bd = new BigDecimal(_cos);
        System.out.println(bd);

    }

}

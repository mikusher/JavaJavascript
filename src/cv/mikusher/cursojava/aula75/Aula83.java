




package cv.mikusher.cursojava.aula75;





public class Aula83 {

    public static void main(String[] args) {

        String[] letras = { "B", "C", "D", "E", "F" };

        String alfabeto = "";

        System.out.println("--Normal--");
        for (String rows : letras) {
            alfabeto += rows;
        }

        System.out.println(alfabeto);

        System.out.println("--Buffer--");
        StringBuffer sb = new StringBuffer();
        for (String _rows : letras) {
            sb.append(_rows);
        }
        alfabeto = sb.toString();
        System.out.println(alfabeto);

        System.out.println("--Builder--");
        StringBuilder sbd = new StringBuilder();
        for (String _rows : letras) {
            sbd.append(_rows);
        }
        alfabeto = sbd.toString();
        System.out.println(alfabeto);
    }

}

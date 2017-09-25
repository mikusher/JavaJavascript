




package cv.mikusher.cursojava.aula75;





import java.util.Arrays;





public class Aula76 {

    public static void main(String[] args) {

        String curso = "Curso ";
        String java = "Java";

        for (int i = 0; i < java.length(); i++) {
            System.out.println(java.charAt(i));
        }

        char[] jav = new char[3];
        java.getChars(0, 3, jav, 0);
        System.out.println(jav);

        byte[] javB = new byte[3];
        java.getBytes(0, 3, javB, 0);
        System.out.println(Arrays.toString(javB));

        char[] javaCh = java.toCharArray();
        System.out.println(javaCh);

    }

}

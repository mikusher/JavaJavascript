




package cv.mikusher.cursojava.aula58;





public class TesteAutoBoxing {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Short num1 = 1;
        Byte num2 = 10;
        Integer num3 = 100;
        Long num4 = 10000l;
        Float num5 = 3.5f; // new Float(3.5f);
        Double num6 = 3.55555;
        Boolean flag2 = true;
        Character a = 'a';

        int num13 = num3; // num3.intValue()

        num3++;
        System.out.println(num13);
        System.out.println(num3);

    }

}

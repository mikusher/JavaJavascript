




package cv.mikusher.cursojava.aula62;





public class ExemploPrintf {

    public static void main(String[] args) {

        // System.out.printf("Hello %s", "Ola Mundo");
        //
        // System.out.println();
        // int valor = 20524125;
        // String olaMundo = "Ola mundo";
        // System.out.printf("%20s", olaMundo);
        // System.out.println();
        // System.out.printf("%-20s", olaMundo);
        // System.out.printf("%015d", valor);

        testeMaisCompleto();
    }





    private static void testeMaisCompleto() {

        double[] precos = { 1000, 123.54, 7843.567, 1, 4.4565 };

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
        }
    }

}

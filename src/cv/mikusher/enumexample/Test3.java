




package cv.mikusher.enumexample;





public class Test3 {

    public static void main(String[] args) {

        // enum valueOf + uppercase
        Operation op = Operation.valueOf("times".toUpperCase());
        System.out.println(op.calculate(10, 3));

    }
}
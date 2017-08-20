




package cv.mikusher.enumexample;





public class Test {

    public static void main(String[] args) {

        // ACTIVE
        System.out.println(UserStatus.ACTIVE);
        // whois.arin.net
        System.out.println(WhoisRIR.ARIN.url());

        double result = Operation.PLUS.calculate(1, 2);
        System.out.println(result); // 3.0

        System.out.println();
        for (UserStatus status : UserStatus.values()) {
            System.out.println(status);
        }

        System.out.println();
        WhoisRIR rir = WhoisRIR.APNIC;
        if (rir == WhoisRIR.APNIC) {
            System.out.println("This is APNIC : " + rir.url());
        }

    }

}
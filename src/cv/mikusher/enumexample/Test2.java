




package cv.mikusher.enumexample;





public class Test2 {

    public static void main(String[] args) {

        WhoisRIR rir = WhoisRIR.RIPE;

        switch (rir) {
            case ARIN:
                System.out.println("This is ARIN");
                break;
            case APNIC:
                System.out.println("This is APNIC");
                break;
            case RIPE:
                System.out.println("This is RIPE");
                break;
            default:
                throw new AssertionError("Unknown RIR " + rir);

        }

    }
}

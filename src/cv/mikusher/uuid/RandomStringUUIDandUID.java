




package cv.mikusher.uuid;





import java.rmi.server.UID;
import java.util.UUID;





public class RandomStringUUIDandUID {

    public static String randomUUIDString = "";





    public static void main(String[] args) {

        // Creating a random UUID (Universally unique identifier).
        UUID uuid = UUID.randomUUID();
        randomUUIDString = uuid.toString();

        // Creating UID
        UID userID = new UID();

        System.out.println("Random UUID String = " + randomUUIDString);
        System.out.println("Random UUID String = " + randomUUIDString.replaceAll("-", ""));
        System.out.println("Random UID: " + userID);

    }
}

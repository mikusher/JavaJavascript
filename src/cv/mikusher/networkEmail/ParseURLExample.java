




package cv.mikusher.networkEmail;





import java.net.MalformedURLException;
import java.net.URL;





public class ParseURLExample {

    public static void main(String[] args) {

        // Create a URL
        try {

            URL url = new URL("http://www.javacodegeeks.com:80/");

            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            String path = url.getPath();

            System.out.println("URL created: " + url);
            System.out.println("protocol: " + protocol);
            System.out.println("host: " + host);
            System.out.println("port: " + port);
            System.out.println("path: " + path);

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }

    }

}
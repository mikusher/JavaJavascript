




package cv.mikusher.databaseMoment;





import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





public class ReadImage {

    public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {

        Connection con = null;
        PreparedStatement pst = null;
        FileOutputStream fos = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "vertrigo";

        try {

            con = DriverManager.getConnection(url, user, password);

            String query = "SELECT Data FROM Images LIMIT 1";
            pst = con.prepareStatement(query);

            ResultSet result = pst.executeQuery();
            result.next();

            fos = new FileOutputStream("careca.jpg");

            Blob blob = result.getBlob("Data");
            int len = (int) blob.length();

            byte[] buf = blob.getBytes(1, len);

            fos.write(buf, 0, len);

        } finally {

            if (pst != null) {
                pst.close();
            }

            if (con != null) {
                con.close();
            }

            if (fos != null) {
                fos.close();
            }
        }
    }
}
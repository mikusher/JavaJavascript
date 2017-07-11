




package cv.mikusher.databaseMoment;





import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;





public class WriteImage {

    public static void main(String[] args) throws FileNotFoundException, SQLException, IOException {

        Connection con = null;
        PreparedStatement pst = null;
        FileInputStream fin = null;

        String cs = "jdbc:mysql://127.0.0.1:3306/testdb?useSSL=false";
        String user = "root";
        String password = "vertrigo";

        try {

            File img = new File("careca.jpg");
            fin = new FileInputStream(img);

            con = DriverManager.getConnection(cs, user, password);

            pst = con.prepareStatement("INSERT INTO Images(Data) VALUES(?)");
            pst.setBinaryStream(1, fin, (int) img.length());
            pst.executeUpdate();

        } finally {

            if (pst != null) {
                pst.close();
            }

            if (con != null) {
                con.close();
            }

            if (fin != null) {
                fin.close();
            }
        }
    }
}





package cv.mikusher.databaseMoment;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Prepared {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pst = null;
        String ssl = "?useSSL=false";

        String url = "jdbc:mysql://127.0.0.1:3306/testdb" + ssl;
        String user = "root";
        String password = "vertrigo";

        try {

            String author = "Trygve Gulbranssen";
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("INSERT INTO Authors(Name) VALUES(?)");
            pst.setString(1, author);
            pst.executeUpdate();

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(Prepared.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {

                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(Prepared.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
}
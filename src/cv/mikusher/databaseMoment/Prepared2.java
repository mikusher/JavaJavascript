




package cv.mikusher.databaseMoment;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Prepared2 {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pst = null;
        String ssl = "?useSSL=false";

        String cs = "jdbc:mysql://127.0.0.1:3306/testdb" + ssl;
        String user = "root";
        String password = "vertrigo";

        try {

            con = DriverManager.getConnection(cs, user, password);

            pst = con.prepareStatement("INSERT INTO Testing(Id) VALUES(?)");

            for (int i = 1; i <= 1000; i++) {

                pst.setInt(1, i * 2);
                pst.executeUpdate();
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(Prepared2.class.getName());
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

                Logger lgr = Logger.getLogger(Prepared2.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
}
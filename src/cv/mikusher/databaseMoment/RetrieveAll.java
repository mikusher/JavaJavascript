




package cv.mikusher.databaseMoment;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;





public class RetrieveAll {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String ssl = "?useSSL=false";

        String url = "jdbc:mysql://127.0.0.1:3306/testdb" + ssl;
        String user = "root";
        String password = "vertrigo";

        try {

            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Authors");
            rs = pst.executeQuery();

            while (rs.next()) {

                System.out.print(rs.getInt(1));
                System.out.print(": ");
                System.out.println(rs.getString(2));
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(RetrieveAll.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {

                if (rs != null) {
                    rs.close();
                }

                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(RetrieveAll.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
}
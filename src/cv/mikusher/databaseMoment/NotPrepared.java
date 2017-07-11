




package cv.mikusher.databaseMoment;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;





public class NotPrepared {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        String ssl = "?useSSL=false";

        String cs = "jdbc:mysql://127.0.0.1:3306/testdb" + ssl;
        String user = "root";
        String password = "vertrigo";

        try {

            con = DriverManager.getConnection(cs, user, password);

            st = con.createStatement();

            for (int i = 1; i <= 1000; i++) {

                String query = "INSERT INTO Testing(Id) VALUES(" + 2 * i + ")";
                st.executeUpdate(query);
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(NotPrepared.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {

                if (st != null) {
                    st.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(NotPrepared.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
}





package cv.mikusher.databaseMoment;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;





public class JdbcAutoGenKey {

    public static void main(String[] args) throws SQLException {

        Connection con = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://127.0.0.1:3306/testdb?useSSL=false";
        String user = "root";
        String password = "vertrigo";

        try {

            String author = "Oscar Wilde";
            con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO Authors(Name) VALUES(?)";

            pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, author);
            pst.executeUpdate();

            ResultSet rs = pst.getGeneratedKeys();

            if (rs.first()) {

                System.out.printf("The ID of new author: %d", rs.getLong(1));
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JdbcAutoGenKey.class.getName());
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

                Logger lgr = Logger.getLogger(JdbcAutoGenKey.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
}
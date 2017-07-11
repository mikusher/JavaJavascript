




package cv.mikusher.databaseMoment;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





public class MultipleStatements {

    public static void main(String[] args) throws SQLException {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        String cs = "jdbc:mysql://localhost:3306/testdb?allowMultiQueries=true&useSSL=false";
        String user = "root";
        String password = "vertrigo";

        try {

            con = DriverManager.getConnection(cs, user, password);

            String query = "SELECT Id, Name FROM Authors WHERE Id=1;" + "SELECT Id, Name FROM Authors WHERE Id=2;" + "SELECT Id, Name FROM Authors WHERE Id=3";

            pst = con.prepareStatement(query);
            boolean isResult = pst.execute();

            do {
                rs = pst.getResultSet();

                while (rs.next()) {

                    System.out.print(rs.getInt(1));
                    System.out.print(": ");
                    System.out.println(rs.getString(2));
                }

                isResult = pst.getMoreResults();

            } while (isResult);

        } finally {

            if (rs != null) {
                rs.close();
            }

            if (pst != null) {
                pst.close();
            }

            if (con != null) {
                con.close();
            }

        }
    }
}
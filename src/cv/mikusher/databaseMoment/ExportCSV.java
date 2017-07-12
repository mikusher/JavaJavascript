




package cv.mikusher.databaseMoment;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;





public class ExportCSV {

    public static void main(String[] args) throws SQLException {

        Connection con = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String user = "root";
        String password = "vertrigo";

        try {

            con = DriverManager.getConnection(url, user, password);
            String query = "SELECT Name, Title INTO OUTFILE '/src/cv/mikusher/databaseMoment/authors_books.csv' " + "FIELDS TERMINATED BY ',' FROM Authors, Books WHERE " + "Authors.Id=Books.AuthorId";

            pst = con.prepareStatement(query);
            pst.execute();

        } finally {

            if (pst != null) {
                pst.close();
            }

            if (con != null) {
                con.close();
            }

        }
    }
}
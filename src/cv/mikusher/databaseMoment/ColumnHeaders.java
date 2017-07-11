




package cv.mikusher.databaseMoment;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Formatter;





public class ColumnHeaders {

    public static void main(String[] args) throws SQLException {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String ssl = "?useSSL=false";

        String url = "jdbc:mysql://127.0.0.1:3306/testdb" + ssl;
        String user = "root";
        String password = "vertrigo";

        try {

            con = DriverManager.getConnection(url, user, password);
            String query = "SELECT Name, Title From Authors, " + "Books WHERE Authors.Id=Books.AuthorId";
            pst = con.prepareStatement(query);

            rs = pst.executeQuery();

            ResultSetMetaData meta = rs.getMetaData();

            String colname1 = meta.getColumnName(1);
            String colname2 = meta.getColumnName(2);

            Formatter fmt1 = new Formatter();
            fmt1.format("%-21s%s", colname1, colname2);
            System.out.println(fmt1);

            while (rs.next()) {

                Formatter fmt2 = new Formatter();
                fmt2.format("%-21s", rs.getString(1));
                System.out.print(fmt2);
                System.out.println(rs.getString(2));
            }

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
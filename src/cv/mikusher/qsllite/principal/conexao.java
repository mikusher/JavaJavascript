




package cv.mikusher.qsllite.principal;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





/**
 *
 * @author latavares
 */

public class conexao {

    static Connection conn     = null;
    private String    contType = null;





    public String getContType() {

        return String.valueOf(contType);
    }





    public String setContType(String contType) {

        return this.contType = contType;
    }





    static String mUser     = "root";
    static String mPassword = "vertrigo";
    static String pUser     = "postgres";
    static String pPassword = "postgres";

    static String sqlLite   = "jdbc:sqlite:src/cv/mikusher/qsllite/BaseDados/Agenda.s3db";
    static String mySql     = "jdbc:mysql://127.0.0.1:3306/testdb?useSSL=false";
    static String postgres  = "jdbc:postgresql://127.0.0.1:5432/testdb";





    public conexao(String _type) {
        String sql, user, password;

        this.contType = _type;

        try {
            if (getContType().toString()
                             .equalsIgnoreCase("mysql")) {
                sql = this.mySql;
                user = this.mUser;
                password = this.mPassword;
                conn = DriverManager.getConnection(sql, user, password);
                System.out.println("Connection to " + _type + " has been established.");
            } else if (getContType().toString()
                                    .equalsIgnoreCase("psql")) {
                sql = this.postgres;
                user = this.pUser;
                password = this.pPassword;
                conn = DriverManager.getConnection(sql, user, password);
                System.out.println("Connection to " + _type + " has been established.");
            } else if (getContType().toString()
                                    .equalsIgnoreCase("sqlite")) {
                conn = DriverManager.getConnection(this.sqlLite);
                System.out.println("Connection to " + _type + " has been established.");
            } else {
                System.err.println("Error to connect to " + _type);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

}

package cv.bockdamm.tst;





import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.util.Properties;





public class ConnectionTest {

    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("src/cv/bockdamm/tst/db.properties");
        props.load(fis);
        fis.close();

        String postgresconnection = props.getProperty("postgres.url") + props.getProperty("postgres.dbName");
        String postgresusr = props.getProperty("postgres.user");
        String postgrespsw = props.getProperty("postgres.passwd");

        Class.forName(props.getProperty("postgres.driver"));

		try (Connection dbpsql = DriverManager.getConnection(postgresconnection, postgresusr, postgrespsw)) {
			DatabaseMetaData dbpsqlmd = dbpsql.getMetaData();

			System.out.println("Connection to " + dbpsqlmd.getDatabaseProductName() + " "
					+ dbpsqlmd.getDatabaseProductVersion() + " successful.\n");
		}
    }
}

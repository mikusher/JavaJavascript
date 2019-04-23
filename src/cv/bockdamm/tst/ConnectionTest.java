package cv.bockdamm.tst;





import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;





public class ConnectionTest {

	public String makeConnection() throws IOException, ClassNotFoundException, SQLException {
        Properties props = new Properties();
		FileInputStream fis = new FileInputStream("src/com/mikusher/dwr/connection/db.properties");
        props.load(fis);
        fis.close();
        String connectionShow;

        String postgresconnection = props.getProperty("postgres.url") + props.getProperty("postgres.dbName");
        String postgresusr = props.getProperty("postgres.user");
        String postgrespsw = props.getProperty("postgres.passwd");

        Class.forName(props.getProperty("postgres.driver"));

		try (Connection dbpsql = DriverManager.getConnection(postgresconnection, postgresusr, postgrespsw)) {
			DatabaseMetaData dbpsqlmd = dbpsql.getMetaData();

			connectionShow = "Connection to " + dbpsqlmd.getDatabaseProductName() + " "
					+ dbpsqlmd.getDatabaseProductVersion() + " successful.\n";
		}
		
		return connectionShow;

	}
}

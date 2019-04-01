package cv.bockdamm.tst;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class ConnectionTest {

    public static void main(String[] args) throws Exception {
		String DatabaseName = "basecontroller";
		String postgresconnection = "jdbc:postgresql://localhost:5432/" + DatabaseName;
		String postgresusr = "miky";
		String postgrespsw = "mikusher";

		Class.forName("org.postgresql.Driver");

		try (Connection dbpsql = DriverManager.getConnection(postgresconnection, postgresusr, postgrespsw)) {
			DatabaseMetaData dbpsqlmd = dbpsql.getMetaData();

			System.out.println("Connection to " + dbpsqlmd.getDatabaseProductName() + " "
					+ dbpsqlmd.getDatabaseProductVersion() + " successful.\n");
		}
    }
}

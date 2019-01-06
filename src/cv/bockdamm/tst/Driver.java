




package cv.bockdamm.tst;





import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import cv.bockdamm.connsecurity.Connectionsql;





public class Driver {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {

        /*
         * // Instances from Database
         * InstanceQuery query = new InstanceQuery();
         * query.setUsername("postgres");
         * query.setPassword("mikusher");
         * query.setQuery("SELECT price FROM products LIMIT 20");
         * Instances data = query.retrieveInstances();
         * System.out.println(data);
         * // General from Database
         * String database = "wekacontrole";
         * String username = "postgres";
         * String password = "mikusher";
         * // Create and Check Connection
         * Class.forName("org.postgresql.Driver");
         */
        Connection dbpsql = Connectionsql.connect("psql");
        DatabaseMetaData dbpsqlmd = dbpsql.getMetaData();
        System.out.println("Connection to " + dbpsqlmd.getDatabaseProductName() + " " + dbpsqlmd.getDatabaseProductVersion() + " successful.\n");
        dbpsql.close();
        System.out.println("");

        Connection dblite = Connectionsql.connect("sqlite");
        DatabaseMetaData dblitemd = dblite.getMetaData();
        System.out.println("Connection to " + dblitemd.getDatabaseProductName() + " " + dblitemd.getDatabaseProductVersion() + " successful.\n");
        dblite.close();
        /*
         * // Query
         * Statement sql = db.createStatement();
         * String laSql = "SELECT id FROM DataSales LIMIT 10";
         * ResultSet results = sql.executeQuery(laSql);
         * if (results != null) {
         * while (results.next()) {
         * System.out.println("id = " + results.getInt("id"));
         * }
         * }
         * assert results != null;
         * results.close();
         */
        // Clean Up

    }
}

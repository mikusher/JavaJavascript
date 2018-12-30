package cv.mikusher.wekaControler.latavares;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import weka.core.Instances;
import weka.experiment.InstanceQuery;

public class Driver {
  public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
    /***************************
     * Instances from Database
     ****************************/
    InstanceQuery query = new InstanceQuery();
    query.setUsername("postgres");
    query.setPassword("mikusher");
    query.setQuery("SELECT price FROM products LIMIT 20");

    Instances data = query.retrieveInstances();
    System.out.println(data);

    /***************************
     * General from Database
     ****************************/
    // User Configurations
    String database = "wekacontrole";
    String username = "postgres";
    String password = "mikusher";

    // Create and Check Connection
    Class.forName("org.postgresql.Driver");
    Connection db = DriverManager.getConnection("jdbc:postgresql:" + database, username, password);
    DatabaseMetaData dbmd = db.getMetaData();
    // System.out.println("Connection to " + dbmd.getDatabaseProductName() + " "
    // + dbmd.getDatabaseProductVersion() + " successful.\n");

    // Query
    Statement sql = db.createStatement();
    String laSql = "SELECT id FROM products LIMIT 10";
    ResultSet results = sql.executeQuery(laSql);
    if (results != null) {
      while (results.next()) {
        // System.out.println("id = " + results.getInt("id"));
      }
    }
    assert results != null;
    results.close();

    // Clean Up
    db.close();
  }
}

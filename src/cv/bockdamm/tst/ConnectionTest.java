package cv.bockdamm.tst;

import cv.bockdamm.connsecurity.Connectionsql;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class ConnectionTest {

    public static void main(String[] args) throws Exception {
        String GENERAL_TABLE      = "basecontroller";
        String postgresconnection = "jdbc:postgresql://localhost:5432/" + GENERAL_TABLE;
        String postgresuser       = "miky";
        String postgrespassword   = "mikusher";

        Class.forName("org.postgresql.Driver");
        Connection dbpsql = DriverManager.getConnection(postgresconnection, postgresuser, postgrespassword);
        DatabaseMetaData dbpsqlmd = dbpsql.getMetaData();
        System.out.println("Connection to " + dbpsqlmd.getDatabaseProductName() + " " + dbpsqlmd.getDatabaseProductVersion() + " successful.\n");
        dbpsql.close();

    }
}

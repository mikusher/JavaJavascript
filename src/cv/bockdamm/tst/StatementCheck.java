package cv.bockdamm.tst;





import java.sql.Connection;
import java.sql.DatabaseMetaData;

import cv.bockdamm.connsecurity.Connectionsql;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

public class StatementCheck {

    public static void main(String[] args) throws Exception {

        InstanceQuery query = new InstanceQuery();
        Connection dbpsql = Connectionsql.connect("psql");
        DatabaseMetaData dbpsqlmd = dbpsql.getMetaData();
        System.out.println("Connection to " + dbpsqlmd.getDatabaseProductName() + " " + dbpsqlmd.getDatabaseProductVersion() + " successful.\n");


        query.setUsername("postgres");
        query.setPassword("mikusher");
        query.setQuery("SELECT sexo,idade,filhos,gasta_muito FROM vendas LIMIT 20");
        Instances data = query.retrieveInstances();
        System.out.println(data);

        dbpsql.close();

        /**
         * Connection dblite = Connectionsql.connect("sqlite");
         * DatabaseMetaData dblitemd = dblite.getMetaData();
         * System.out.println("Connection to " + dblitemd.getDatabaseProductName() + " " + dblitemd.getDatabaseProductVersion() + " successful.\n");
         * dblite.close();
         **/

    }

}

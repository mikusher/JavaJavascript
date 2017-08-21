




package cv.mikusher.agenda.classe;





import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

import org.apache.log4j.Logger;





public class OperationLOG {

    private static String      LOG_DIR         = "src/cv/mikusher/agenda/classe/log/";

    public static final Logger LOGGER          = Logger.getLogger(OperationLOG.class.getName());

    Handler                    fileHandler     = null;
    Formatter                  simpleFormatter = null;





    public OperationLOG(String logName) {

        // TODO Auto-generated constructor stub
        try {
            fileHandler = new FileHandler(LOG_DIR + logName + ".log");
            simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            fileHandler.setLevel(Level.ALL);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}






package cv.mikusher.agenda.classe;





/**
 * Luis Amilcar Tavares
 */
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;





public class LoggOperation {

    private static final String LOG_DIR        = "src/cv/mikusher/agenda/classe/log/";

    public static final Logger  LOGGER         = Logger.getLogger(LoggOperation.class.getName());
    private FileHandler         fh;
    private Handler             consoleHandler = null;
    private Handler             fileHandler    = null;





    public LoggOperation() {

        // TODO Auto-generated constructor stub
        try {
            this.consoleHandler = new ConsoleHandler();
            this.fileHandler = new FileHandler(LOG_DIR + "logfile.log");
            LOGGER.addHandler(this.consoleHandler);
            LOGGER.addHandler(this.fh);

            this.consoleHandler.setLevel(Level.ALL);
            this.fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);

            LOGGER.config("Configuration done.");

            LOGGER.removeHandler(this.consoleHandler);

        } catch (IOException | SecurityException e) {
            // TODO: handle exception
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", e);
        }
    }

}

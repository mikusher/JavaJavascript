
package cv.mikusher.agenda.classe;

/**
 * Luis Amilcar Tavares
 */
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggOperation {

	private static final String LOG_DIR = "src/cv/mikusher/agenda/classe/log/";

	public static final Logger LOGGER = Logger.getLogger(LoggOperation.class.getName());
	private FileHandler fh;
	private Handler consoleHandler = null;
	private Handler fileHandler = null;

	public LoggOperation() {

		// TODO Auto-generated constructor stub
		try {
			consoleHandler = new ConsoleHandler();
			fileHandler = new FileHandler(LOG_DIR + "logfile.log");
			LOGGER.addHandler(consoleHandler);
			LOGGER.addHandler(fh);

			consoleHandler.setLevel(Level.ALL);
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);

			LOGGER.config("Configuration done.");

			LOGGER.removeHandler(consoleHandler);

		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", e);
		}
	}

}

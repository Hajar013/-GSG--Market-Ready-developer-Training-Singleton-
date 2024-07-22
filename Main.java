public class Logger {
   
    private static Logger instance;

   
    private Logger() {}

   
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

   
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}


public class Main {
    public static void main(String[] args) {
      
        Logger logger = Logger.getInstance();
        logger.log("Application started");

        logger.log("Performing an operation");
        logger.log("Operation completed");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Logging from another reference to the singleton");

        System.out.println("logger == anotherLogger: " + (logger == anotherLogger));
    }
}

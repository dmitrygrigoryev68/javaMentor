package logging;

import java.util.logging.*;


public class Main {

    public static void main(String[] args) {
        configureLogging();
    }

    private static void configureLogging() {

        Logger.getLogger("org.stepic.java.logging.ClassA").setLevel(Level.ALL);
        Logger.getLogger("org.stepic.java.logging.ClassB").setLevel(Level.WARNING);
        Logger logger = Logger.getLogger("org.stepic.java");

        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
    }
}

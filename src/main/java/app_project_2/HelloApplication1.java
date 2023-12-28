package app_project_2;

import org.apache.logging.log4j.*;

public class HelloApplication1 {
    private static Logger sample_logger = LogManager.getLogger(app_project_2.HelloApplication1.class);

    public static void main(String[] args) {

        sample_logger.info("app_project_2");
        sample_logger.error("app_project_2");
        sample_logger.debug("app_project_2");
        sample_logger.fatal("app_project_2");
    }
}
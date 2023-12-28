package com.example.app_project;

import org.apache.logging.log4j.*;




public class HelloApplication {
    private static Logger sample_logger = LogManager.getLogger(HelloApplication.class);

    public static void main(String[] args) {

        sample_logger.info("Click succesfull");
        sample_logger.error("DB Conection faled");
        sample_logger.debug("This is debug");
        sample_logger.fatal("This is fatal");
    }
}

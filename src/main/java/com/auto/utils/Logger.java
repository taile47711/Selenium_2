package com.auto.utils;

import org.testng.Reporter;

public class Logger {
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger
            .getLogger(Logger.class);

    public static void info(String message) {
        Reporter.log("<b>INFO: </b>" + message);
        log.info(message);
    }

    public static void step(String message) {
        Reporter.log("<b>STEP: </b>" + message);
        log.info("STEP: " + message);
    }

    public static void verify(String message) {
        Reporter.log(
                "<b style=\"color: #44aa44;\">VERIFY POINT: </b>" + message);
        log.info("VERIFY POINT: " + message);
    }
}

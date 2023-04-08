package com.spring.loggingservice.model;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

public class ColorLogger {
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(Slf4j.class);

    public void logColorInfo(String logging){
        logger.info("\u001B[34m" + logging + "\u001B[0m");
    }
}

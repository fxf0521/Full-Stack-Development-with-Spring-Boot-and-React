package com.fxf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter01Application {
    private static final Logger logger = LoggerFactory.getLogger(Chapter01Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Chapter01Application.class, args);
        logger.info("Application started");
    }

}

/*
 * Copyright (C) 2016 Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.outros;

import java.util.UUID;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 *
 * @author Mikusher
 */
public class Log4j2HW {

    private static final Logger LOGGER = LogManager.getLogger(Log4j2HW.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Add context information
        ThreadContext.push(UUID.randomUUID().toString());
        ThreadContext.push("192.168.21.9");

        LOGGER.debug("Debug Message Logged !!");
        LOGGER.info("Info Message Logged !!");
        LOGGER.debug("Another Debug Message !!");

        //Clear the map
        ThreadContext.clearStack();
        LOGGER.debug("Thread Context Cleaned up !!");
        LOGGER.debug("Log message with no context information !!");
    }
}

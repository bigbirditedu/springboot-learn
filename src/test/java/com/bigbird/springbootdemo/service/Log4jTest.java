package com.bigbird.springbootdemo.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jTest {
    @Test
    public void testLog4j(){
        Logger logger = LoggerFactory.getLogger(Log4jTest.class);
        logger.debug("log4j2 success ===== debug");
        logger.info("log4j2 success ===== info");
        logger.warn("log4j2 success ===== warn");
        logger.error(System.getProperty("user.home") + " ===== error");
    }
}

package com.bigbird.springbootdemo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.springframework.stereotype.Service;

@Service
public class Log4j2Service1 {
    private Logger logger = LogManager.getLogger(Log4j2Service1.class);

    public void showLog() {
        logger.debug("Log4j2Service1我是DEBUG日志1");
        logger.info("Log4j2Service1我是INFO日志2");
        logger.warn("Log4j2Service1我是WARN日志3");
        logger.error("Log4j2Service1我是ERROR日志4");
        Marker marker = MarkerManager.getMarker("test");
        logger.error(marker, "Log4j2Service1我是ERROR日志5");
        logger.fatal("Log4j2Service1我是FATAL日志6");
    }
}

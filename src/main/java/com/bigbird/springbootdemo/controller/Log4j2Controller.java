package com.bigbird.springbootdemo.controller;

import com.bigbird.springbootdemo.service.Log4j2Service1;
import com.bigbird.springbootdemo.service.Log4j2Service2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/log4j2")
public class Log4j2Controller {

    private Logger logger = LogManager.getLogger(Log4j2Controller.class);

    @Resource
    private Log4j2Service1 log4j2Service1;

    @Resource
    private Log4j2Service2 log4j2Service2;

    @RequestMapping("/showLog1")
    public Map<String, Object> showLog(@RequestParam("name") String name, @RequestParam("age") int age) {
        Map<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("age", age);
        logger.info("controller的info日志：" + result.toString());
        logger.warn("controller的warn日志：" + result.toString());
        logger.error("controller的error日志：" + result.toString());
        logger.fatal("controller的fatal日志：" + result.toString());

        log4j2Service1.showLog();
        return result;
    }

    @RequestMapping("/showLog2")
    public String showLog2() {
        logger.info("controller的info日志：showLog2");
        logger.warn("controller的warn日志：showLog2");
        logger.error("controller的error日志：showLog2");
        logger.fatal("controller的fatal日志：showLog2");
        log4j2Service2.showLog();
        return "success";
    }
}

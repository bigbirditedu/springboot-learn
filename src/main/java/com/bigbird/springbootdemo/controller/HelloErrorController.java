package com.bigbird.springbootdemo.controller;
import com.bigbird.springbootdemo.exception.CustomGenericException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class HelloErrorController {
    //全局捕获运行时异常，采用AOP技术，异常通知
    @RequestMapping("errortest")
    @ResponseBody
    public String test1(int i) {
        System.out.println("i:" + i);
        int j = 1 / i;
        return "success " + j;
    }

    @RequestMapping(value = "/errortest/{type}", method = RequestMethod.GET)
    public ModelAndView test2(@PathVariable(value = "type") String type) throws Exception {
        System.out.println("type:" + type);
        if ("1".equals(type)) {
            // 由handleCustomException处理
            throw new CustomGenericException("0106699", "业务系统处理异常");
        } else if ("2".equals(type)) {
            // 由handleAllException处理
            throw new IOException("IO处理异常");
        } else {
            return new ModelAndView("myjsp2").addObject("msg", type);
        }
    }
}

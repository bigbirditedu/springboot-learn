package com.bigbird.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JspController {
    @RequestMapping("/jspindex")
    public String index() {
        return "myjsp";
    }

    @RequestMapping("/jspindex2")
    public ModelAndView index2(@RequestParam(value = "param", required = false) String param) {
        System.out.println("param:" + param);
        ModelAndView mv = new ModelAndView("myjsp2");
        mv.addObject("msg", "我的返回类型是ModelAndView " + param);
        List list = new ArrayList();
        list.add("许三");
        list.add("衡二");
        list.add("马骚");
        mv.addObject("list", list);
        return mv;
    }
}


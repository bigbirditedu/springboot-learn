package com.bigbird.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotDeployController {
    @RequestMapping("/page1")
    public String index() {
        String result = "java application V1.1";
        return result;
    }

//	@RequestMapping("/page2")
//	public String index2() {
//        String result = "java application V2.1";
//		return result;
//	}
}

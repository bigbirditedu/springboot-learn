package com.bigbird.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class FreeMarkerController {

    @RequestMapping("/index")
    public String myIndex(Map<String, Object> map) {
        map.put("name", "大鸟哥");
        map.put("age", 22);
        return "myIndex";
    }

    @RequestMapping("/index2")
    public String index(Map<String, Object> result) {
        result.put("name", "大鸟哥");
        result.put("sex", "0");

        List<String> listResult = new ArrayList<>();
        listResult.add("zhangsan");
        listResult.add("lisi");
        listResult.add("wangwu");
        result.put("userlist", listResult);
        return "myIndex2";
    }
}

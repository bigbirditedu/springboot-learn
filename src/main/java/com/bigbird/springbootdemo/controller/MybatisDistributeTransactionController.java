package com.bigbird.springbootdemo.controller;

import com.bigbird.springbootdemo.service.UserService01;
import com.bigbird.springbootdemo.service.UserService02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisDistributeTransactionController {
    @Autowired
    private UserService01 userService01;

    @Autowired
    private UserService02 userService02;

    @RequestMapping("/insertUserTest01")
    public Integer insertUserTest1(String name, int age) {
        return userService01.insertUser(name + "_Test1", age);
    }

    @RequestMapping("/insertUserTest02")
    public Integer insertUserTest2(String name, int age) {
        return userService02.insertUser(name + "_Test2", age);
    }

    @RequestMapping("/insertUserTest01AndTest02")
    public int insertUserTest01AndTest02(String name, int age) {
        return userService02.insertUserTest01AndTest02(name + "_Test01AndTest02", age);
    }
}

//package com.bigbird.springbootdemo.controller;
//
//import com.bigbird.springbootdemo.model.User;
//import com.bigbird.springbootdemo.service.UserService01;
//import com.bigbird.springbootdemo.service.UserService02;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class MybatisMultilDataSourceController {
//    @Autowired
//    private UserService01 userService01;
//    @Autowired
//    private UserService02 userService02;
//
//    @RequestMapping("/insertUser01")
//    public int insertUserTest1(String name, String userName,int age) {
//        return userService01.insertUser(name,userName, age);
//    }
//
//    @RequestMapping("/insertUser02")
//    public int insertUserTest2(String name, String userName,int age) {
//        return userService02.insertUser(name, userName,age);
//    }
//
//    @RequestMapping("/insertUser01And02")
//    public int insertUserTest01AndTest02(String name,String userName, int age) {
//        return userService02.insertUserTest01AndTest02(name, userName,age);//同时操作两个数据库
//    }
//
//    @RequestMapping("/queryUser01")
//    public User queryUser01(String name) {
//        return userService01.queryUserByName(name);
//    }
//
//    @RequestMapping("/queryAllUser01")
//    public List<User> queryAllUser01() {
//        return userService01.queryAllUsers();
//    }
//
//    @RequestMapping("/queryAllUser02")
//    public List<User> queryAllUser02() {
//        return userService02.queryAllUsers();
//    }
//}
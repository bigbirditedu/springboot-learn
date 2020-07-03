//package com.bigbird.springbootdemo.service;
//
//import com.bigbird.springbootdemo.model.User;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.time.LocalDate;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class UserServiceTest {
//    @Autowired
//    UserServiceImpl userService;
//
//    @Test
//    void createUser() {
//        User user = new User();
//        user.setName("周先生");
//        user.setUserName("大鸟哥");
//        user.setAge(26);
//        user.setSex("男");
//        user.setPass("12334");
//        user.setBirthday(LocalDate.now().toString());
//        userService.createUser(user);
//    }
//
//    @Test
//    void getUser() {
//        User user = new User();
//        user.setId(1);
//        System.out.println(userService.getUser(user));
//    }
//
//    @Test
//    void deleteUser() {
//        User user = new User();
//        user.setId(1);
//        userService.deleteUser(user);
//    }
//}
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
//class UserService4MybatisImplTest {
//    @Autowired
//    MyUserMapper userMapper;
//
//    @Test
//    void createUser() {
//        User user = new User();
//        user.setName("丁小姐");
//        user.setUserName("别后知远方");
//        user.setAge(22);
//        user.setSex("女");
//        user.setPass("212334");
//        user.setBirthday(LocalDate.now().toString());
//        userMapper.insertUser(user);
//    }
//
//    @Test
//    void getUser() {
//        User user = userMapper.findByName("周老板");
//        System.out.println(user);
//    }
//
//    @Test
//    void deleteUser() {
//        userMapper.deleteUserById(2);
//    }
//}
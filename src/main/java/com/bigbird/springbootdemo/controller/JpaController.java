//package com.bigbird.springbootdemo.controller;
//
//import com.bigbird.springbootdemo.dao.UserDao;
//import com.bigbird.springbootdemo.model.UserEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Optional;
//
//@RestController
//public class JpaController {
//
//    @Autowired
//    private UserDao userDao;
//
//    @RequestMapping("/jpaFindUser")
//    public Object findUser(UserEntity user) {
//        Optional<UserEntity> userOptional = userDao.findById(user.getId());
//        UserEntity reusltUser = userOptional.get();
//        return reusltUser == null ? "没有查询到数据" : reusltUser;
//    }
//
//    @RequestMapping("/jpaInsertUser")
//    public Object insertUser(UserEntity user) {
//        UserEntity entity = userDao.save(user);
//        return entity;
//    }
//
//    @RequestMapping("/jpaDeleteUser")
//    public Object deleteUser(UserEntity user) {
//        userDao.delete(user);
//        return "success";
//    }
//}
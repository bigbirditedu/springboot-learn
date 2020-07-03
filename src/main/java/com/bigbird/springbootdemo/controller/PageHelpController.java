//package com.bigbird.springbootdemo.controller;
//
//
//import com.bigbird.springbootdemo.model.User;
//import com.bigbird.springbootdemo.service.UserService4MybatisImpl;
//import com.github.pagehelper.PageInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class PageHelpController {
//    @Autowired
//    private UserService4MybatisImpl userService;
//
//    @RequestMapping("/findUserList")
//    public PageInfo<User> findUserList(@RequestParam(value = "page", required = false, defaultValue = "1") int page,
//                                       @RequestParam(value = "size", required = false, defaultValue = "3") int size) {
//        System.out.println("====================page:" + page + " size:" + size + "====================");
//        return userService.findUserList(page, size);
//    }
//}

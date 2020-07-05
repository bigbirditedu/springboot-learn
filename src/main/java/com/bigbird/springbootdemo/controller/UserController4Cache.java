package com.bigbird.springbootdemo.controller;

import com.bigbird.springbootdemo.model.User4Cache;
import com.bigbird.springbootdemo.service.UserService4Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cache")
public class UserController4Cache {

    @Autowired
    UserService4Cache userService;

    @RequestMapping(value = "/saveUser")
    public int saveUser(User4Cache user) {
        return userService.saveUser(user);
    }

    @RequestMapping(value = "/queryUser")
    public User4Cache queryUser(@RequestParam Integer id) {
        User4Cache user = userService.getUser(id);
        if (user == null) {
            System.out.println("没有查到数据,uid:" + id);
        }
        return user;
    }

    @RequestMapping(value = "/updateUser")
    public User4Cache updateUser(User4Cache user) {
        return userService.updateUser(user);
    }
}

package com.bigbird.springbootdemo.service;

import com.bigbird.springbootdemo.mapper1.UserMapper01;
import com.bigbird.springbootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService01 {
    @Autowired
    private UserMapper01 userMapper01;

    public int insertUser(String name, String userName, int age) {
        User user = new User();
        user.setName(name);
        user.setUserName(userName);
        user.setAge(age);
        int insertUserResult = userMapper01.insertUser(user);
        return insertUserResult;
    }

    public User queryUserByName(String userName) {
        User user = userMapper01.findUserByUserName(userName);
        return user;
    }

    public List<User> queryAllUsers() {
        List<User> allUsers = userMapper01.findAllUsers();
        return allUsers;
    }

    //此时第1个数据源的数据会正常执行事务(异常回滚)，事务管理器所决定
    //@Transactional(transactionManager = "test1TransactionManager",rollbackFor = Exception.class)
    @Transactional(rollbackFor = Exception.class)
    public int insertUser(String name, int age) {
        User user = new User();
        user.setName(name + "_01");
        user.setAge(age);
        int insertUserResult = userMapper01.insertUser(user);
        System.out.println("######insertUserResult:{}##########" + insertUserResult);
        int i = 1 / 0;
        return insertUserResult;
    }
}

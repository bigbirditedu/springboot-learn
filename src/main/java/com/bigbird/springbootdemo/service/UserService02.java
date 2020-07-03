package com.bigbird.springbootdemo.service;

import com.bigbird.springbootdemo.mapper1.UserMapper01;
import com.bigbird.springbootdemo.mapper2.UserMapper02;
import com.bigbird.springbootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService02 {
    @Autowired
    private UserMapper01 userMapper01;
    @Autowired
    private UserMapper02 userMapper02;

    public int insertUser(String name, String userName, Integer age) {
        User user = new User();
        user.setName(name);
        user.setUserName(userName);

        user.setAge(age);
        int insertUserResult = userMapper02.insertUser(user);
        return insertUserResult;
    }

    public int insertUserTest01AndTest02(String name, String userName, Integer age) {
        User user = new User();
        user.setName(name);
        user.setUserName(userName);
        user.setAge(age);
        // 第一个数据源
        int insertUserResult01 = userMapper01.insertUser(user);
        // 第二个数据源
        int insertUserResult02 = userMapper02.insertUser(user);
        int result = insertUserResult01 + insertUserResult02;
        return result;
    }

    public List<User> queryAllUsers() {
        List<User> allUsers1 = userMapper01.findAllUsers();
        List<User> allUsers2 = userMapper02.findAllUsers();
        allUsers2.addAll(allUsers1);
        return allUsers2;
    }

    //此时第2个数据源的数据会正常执行事务(异常回滚)，事务管理器所决定
    //@Transactional(transactionManager = "test2TransactionManager", rollbackFor = Exception.class)
    @Transactional(rollbackFor = Exception.class)
    public int insertUser(String name, int age) {
        User user = new User();
        user.setName(name + "_02");
        user.setAge(age);
        int insertUserResult = userMapper02.insertUser(user);
        System.out.println("######insertUserResult:{}##########" + insertUserResult);
        int i = 1 / 0;
        return insertUserResult;
    }

    //此时只有第2个数据源的数据会执行事务(异常回滚)，第1个不会回滚，数据中被插入一条_01记录,事务管理器所决定
    //@Transactional(transactionManager = "test2TransactionManager", rollbackFor = Exception.class)
    @Transactional(rollbackFor = Exception.class)
    public int insertUserTest01AndTest02(String name, int age) {
        User user = new User();
        user.setName(name + "_01");
        user.setAge(age);
        // 第一个数据源
        int insertUserResult01 = userMapper01.insertUser(user);
        // 第二个数据源
        user.setName(name + "_02");
        int insertUserResult02 = userMapper02.insertUser(user);
        int result = insertUserResult01 + insertUserResult02;
        System.out.println("######insertUserResult:{}##########" + result);
        int i = 1 / 0;//制造回滚条件
        return result;
    }
}

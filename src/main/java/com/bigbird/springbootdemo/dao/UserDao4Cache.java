package com.bigbird.springbootdemo.dao;

import com.bigbird.springbootdemo.model.User4Cache;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao4Cache {

    Map<String, User4Cache> data = new HashMap<>();

    public User4Cache getUserById(int id) {
        //模拟数据库返回
        return data.get(id + "");
    }

    public int insertUser(User4Cache user) {
        //模拟数据库返回
        data.put(user.getId() + "", user);
        return 1;
    }

    public User4Cache updateUser(User4Cache user) {
        User4Cache user4Cache = data.get(user.getId() + "");
        if (user4Cache != null) {
            if (user.getAge() != null) {
                user4Cache.setAge(user.getAge());
            }
            if (user.getUserName() != null && !user.getUserName().isEmpty()) {
                user4Cache.setUserName(user.getUserName());
            }
        }
        return user4Cache;
    }
}


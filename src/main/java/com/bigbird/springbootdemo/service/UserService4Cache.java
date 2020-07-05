package com.bigbird.springbootdemo.service;

import com.bigbird.springbootdemo.dao.UserDao4Cache;
import com.bigbird.springbootdemo.model.User4Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService4Cache {

    @Autowired
    UserDao4Cache userDao;

    @CacheEvict(value = "userCache", key = "#user.id")
    public int saveUser(User4Cache user) {
        return userDao.insertUser(user);
    }

    @Cacheable(value = "userCache", key = "#userId")
    public User4Cache getUser(int userId) {
        return userDao.getUserById(userId);
    }

    @CachePut(value = "userCache", key = "#user.id")
    public User4Cache updateUser(User4Cache user) {
        return userDao.updateUser(user);
    }
}

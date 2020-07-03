//package com.bigbird.springbootdemo.service;
//
//import com.bigbird.springbootdemo.model.User;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService4MybatisImpl implements UserService {
//    @Autowired
//    private MyUserMapper userMapper;
//
//    @Override
//    public void createUser(User user) {
//        userMapper.insertUser(user);
//    }
//
//    @Override
//    public User getUser(User user) {
//        User userRes = userMapper.findByName(user.getName());
//        return userRes;
//    }
//
//    @Override
//    public void deleteUser(User user) {
//        userMapper.deleteUserById(user.getId());
//    }
//
//    /**
//     * page 当前页数
//     * size 每页大小
//     *
//     * @param pageNum
//     * @param pageSize
//     * @return
//     */
//    public PageInfo<User> findUserList(int pageNum, int pageSize) {
//        // 开启分页插件,放在查询语句上面,作用于后面第一条sql语句
//        PageHelper.startPage(pageNum, pageSize);
//        List<User> listUser = userMapper.findAllUsers();
//        // 封装分页之后的数据
//        PageInfo<User> pageInfoUser = new PageInfo<>(listUser);
//        return pageInfoUser;
//    }
//}

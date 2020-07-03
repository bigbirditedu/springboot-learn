package com.bigbird.springbootdemo.mapper2;

import com.bigbird.springbootdemo.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserMapper02 {
    // 查询
    @Select("SELECT * FROM T_USER WHERE USER_NAME = #{userName}")
    @Results({@Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR)})
    User findUserByUserName(@Param("userName") String userName);

    @Select("SELECT * FROM T_USER ")
    @Results({@Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR)})
    List<User> findAllUsers();

    // 新增
    @Insert("INSERT INTO T_USER(NAME,USER_NAME,PASS,AGE,SEX,BIRTHDAY) VALUES (#{name},#{userName}, #{pass}, #{age}, #{sex}, #{birthday})")
    int insertUser(User user);
}

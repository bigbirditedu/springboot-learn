//package com.bigbird.springbootdemo.service;
//
//import com.bigbird.springbootdemo.model.User;
//import org.apache.ibatis.annotations.*;
//import org.apache.ibatis.type.JdbcType;
//
//import java.util.List;
//
//public interface MyUserMapper {
//    // 查询
//    @Select("SELECT * FROM T_USER WHERE NAME = #{name}")
//    @Results({
//            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR)
//    })
//    User findByName(@Param("name") String name);
//
//    // 删除
//    @Delete("DELETE FROM T_USER WHERE id = #{id}")
//    int deleteUserById(@Param("id") int id);
//
//    // 添加
//    @Insert("INSERT INTO T_USER(NAME,USER_NAME,PASS,AGE,SEX,BIRTHDAY) VALUES (#{name},#{userName}, #{pass}, #{age}, #{sex}, #{birthday})")
//    int insertUser(User user);
//
//    @Select("SELECT * FROM T_USER")
//    @Results({@Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR)})
//    List<User> findAllUsers();
//}

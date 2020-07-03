//package com.bigbird.springbootdemo.service;
//
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Param;
//
//public interface UserMapper4Transaction {
//    // 添加
//    @Insert("INSERT INTO T_USER(NAME, AGE) VALUES(#{name}, #{age})")
//    public int insert(@Param("name") String name, @Param("age") Integer age);
//}
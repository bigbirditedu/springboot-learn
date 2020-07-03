//package com.bigbird.springbootdemo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class UserService4Transaction {
//    @Autowired
//    private UserMapper4Transaction userMapper4Transaction;
//
//    //不加事务时，mysql默认单条语句加事务，debug执行完第一行insert代码时数据库即会有数据,且方法执行完最终数据库有一条记录
//    public int insertUser(String name, Integer age) {
//        int insertUserResult1 = userMapper4Transaction.insert(name + "_no_transaction_01", age);
//        int i = 1 / 0;
//        int insertUserResult2 = userMapper4Transaction.insert(name + "_no_transaction_02", age);
//        return insertUserResult1 + insertUserResult2;
//    }
//
//    //加事务注解时，debug执行到第一行红色代码时数据库不会有数据，等到最终没有异常，才会提交，数据库异常会回滚，最终没有数据落库
//    @Transactional
//    public int insertUserWithTransaction(String name, Integer age) {
//        int insertUserResult1 = userMapper4Transaction.insert(name + "_transaction_01", age);
//        int i = 1 / 0;
//        int insertUserResult2 = userMapper4Transaction.insert(name + "_transaction_02", age);
//        return insertUserResult1 + insertUserResult2;
//    }
//}

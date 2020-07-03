package com.bigbird.springbootdemo;

import com.bigbird.springbootdemo.config.DBConfig1;
import com.bigbird.springbootdemo.config.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

// 开启读取配置文件
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
@MapperScan(basePackages = {"com.bigbird.springbootdemo.service"})
@SpringBootApplication
public class SpringbootLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootLearnApplication.class, args);
    }
}

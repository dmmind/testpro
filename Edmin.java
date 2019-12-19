package com.cn.zug;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan
@MapperScan("com.cn.zug.mapper")
@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan(basePackages = { "com.cn.zug" })
@EnableTransactionManagement(proxyTargetClass = true)
public class Edmin {
    public static void main(String[] args) {
        SpringApplication.run(Edmin.class);
    }
}

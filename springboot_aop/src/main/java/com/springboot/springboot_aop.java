package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.lancer.Interface")
@SpringBootApplication
public class springboot_aop {

    public static void main(String[] args){
        SpringApplication.run(springboot_aop.class);
    }
}

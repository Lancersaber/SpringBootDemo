package com.lancer.springboot.configuration.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 验证自定义配置文件映射到特定bean上
 * 在这个类上使用@Value取值
 */
@Component
@PropertySource(value = "classpath:test.properties")
public class Test {

    @Value("${name}")
    private String name;

    @Value("${password}")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

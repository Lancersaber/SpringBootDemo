package com.lancer.springboot.configuration;

import com.lancer.springboot.configuration.bean.Test2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigurationApplicationTests {

    @Autowired
    com.lancer.springboot.configuration.bean.Test testBean;

    @Autowired
    Test2 test2=new Test2();

    @Test
    void contextLoads() {
    }

    @Test
    public void test01(){
        System.out.println(testBean.getName()+" "+testBean.getPassword());
    }

    @Test
    public void test02(){
        System.out.println(test2.getName()+" "+test2.getPassword());
    }
}

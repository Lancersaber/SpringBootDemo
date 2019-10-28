package com.MyTest;

import com.lancer.Interface.SysLogMapper;
import com.lancer.bean.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest(classes = Test.class)
public class Test {

    @Autowired
    private SysLogMapper mapper;

    @org.junit.jupiter.api.Test
    public void test01(){
        SysLog log=new SysLog();
        log.setCREATE_TIME(new Date());
        log.setTIME(10);
        log.setUSERNAME("root");
        log.setIP("10.0.0.1");
        log.setMETHOD("hello()");
        log.setOPERATION("operation");
        mapper.insert(log);
    }
}

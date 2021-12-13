package com.antra.demo.springbootjunitmockito.junit.test;

import com.antra.demo.springbootjunitmockito.SayGoodByeService;
import com.antra.demo.springbootjunitmockito.SayHelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JunitDemoTest_2InjectBean {
    @Autowired
    SayHelloService sayHelloService;

    @Autowired
    SayGoodByeService sayGoodByeService;

    @Test
    public void sayHelloToNormalName() {
        assertEquals("Hello Jerry", sayHelloService.sayHelloTo("Jerry"));
    }

    @Test
    public void sayGoodByte() {
        assertEquals("GoodBye real", sayGoodByeService.sayGoodBye());
    }

}

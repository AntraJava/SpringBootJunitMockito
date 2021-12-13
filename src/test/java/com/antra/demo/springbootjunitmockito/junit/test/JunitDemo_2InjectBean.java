package com.antra.demo.springbootjunitmockito.junit.test;

import com.antra.demo.springbootjunitmockito.SayGoodByeService;
import com.antra.demo.springbootjunitmockito.SayHelloService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JunitDemo_2InjectBean {
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

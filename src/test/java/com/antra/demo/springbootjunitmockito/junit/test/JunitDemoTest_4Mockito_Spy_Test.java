package com.antra.demo.springbootjunitmockito.junit.test;

import com.antra.demo.springbootjunitmockito.SayGoodByeService;
import com.antra.demo.springbootjunitmockito.SayHelloService;
import com.antra.demo.springbootjunitmockito.thirdParty.DemoClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

public class JunitDemoTest_4Mockito_Spy_Test {

    @Spy
    private SayHelloService sayHelloService;

    @BeforeEach
    public void setupMockito() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testHi() {
        System.out.println(this.sayHelloService.sayHi("Dawei"));
        doReturn("Hi Daniel").when(sayHelloService).sayHi(anyString());
        System.out.println(this.sayHelloService.sayHi("Dawei"));
    }

}

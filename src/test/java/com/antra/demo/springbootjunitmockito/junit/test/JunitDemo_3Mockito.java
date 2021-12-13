package com.antra.demo.springbootjunitmockito.junit.test;

import com.antra.demo.springbootjunitmockito.SayGoodByeService;
import com.antra.demo.springbootjunitmockito.SayHelloService;
import com.antra.demo.springbootjunitmockito.thirdParty.DemoClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JunitDemo_3Mockito {
    @Mock
    private DemoClient demoClient;

    @InjectMocks
    private SayGoodByeService sayGoodByeService;

    @BeforeEach
    public void setupMockito() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void showHowMockitoWorks() {
        when(demoClient.getName()).thenReturn("Lily");
        System.out.println(demoClient.getName());
    }

    @Test
    public void setMockToClass() {
        when(demoClient.getName()).thenReturn("Lucy");
        String result = sayGoodByeService.sayGoodBye();
        assertEquals("GoodBye Lucy", result);
    }


}

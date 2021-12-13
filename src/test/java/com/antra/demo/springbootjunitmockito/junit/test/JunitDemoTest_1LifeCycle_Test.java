package com.antra.demo.springbootjunitmockito.junit.test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JunitDemoTest_1LifeCycle_Test {
    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before ALL test method is executed..");
    }
    @BeforeEach
    public void before(){
        System.out.println("Before each test method is executed..");
    }
    @Test
    public void testMethod(){
        System.out.println("in test 1");
        assertTrue(100/2 == 50);
    }
    @Test
    public void testMethod2(){
        System.out.println("in test 2");
        assertTrue(60/2 == 30);
    }
    @AfterEach
    public void after(){
        System.out.println("After each test method is executed..");
    }
    @AfterAll
    public static void afterClass(){
        System.out.println("After ALL test method is executed..");
    }
}

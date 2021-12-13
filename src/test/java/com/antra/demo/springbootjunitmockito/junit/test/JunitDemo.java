package com.antra.demo.springbootjunitmockito.junit.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JunitDemo {
    @Test
    public void test1Equals1() {
        assertTrue(1 == 1);
    }

    @Test
    public void test1NotEquals1() {
        assertFalse(1 != 1);
    }

    @Test
    public void testAisA() {
        assertEquals("a", "a");
    }
}

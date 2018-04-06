package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterTest {
    @Test
    void testHello() {
        assertEquals("hello, world", Greeter.sayHello("world"));
    }
}

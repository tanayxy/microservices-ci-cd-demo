package com.example.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void testGreetingWithName() {
        UserService service = new UserService();
        assertEquals("Hello, Tanay!", service.getUserGreeting("Tanay"));
    }

    @Test
    public void testGreetingWithoutName() {
        UserService service = new UserService();
        assertEquals("Hello, Guest!", service.getUserGreeting(""));
    }
}

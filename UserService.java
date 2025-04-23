package com.example.service;

public class UserService {
    public String getUserGreeting(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }
}

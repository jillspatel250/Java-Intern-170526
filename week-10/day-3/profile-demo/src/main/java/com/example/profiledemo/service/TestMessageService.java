package com.example.profiledemo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class TestMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello from TEST environment!";
    }
}

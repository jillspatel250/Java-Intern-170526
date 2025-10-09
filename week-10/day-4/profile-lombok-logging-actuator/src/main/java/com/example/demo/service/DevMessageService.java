package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello from DEV environment!";
    }
}

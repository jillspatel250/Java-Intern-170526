package com.example.profiledemo;

import com.example.profiledemo.config.AppConfig;
import com.example.profiledemo.service.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProfileDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfileDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(MessageService messageService, AppConfig config) {
        return args -> {
            System.out.println("=== Active Profile Demo ===");
            System.out.println("Message from Service: " + messageService.getMessage());
            System.out.println("Message from Config: " + config.getAppMessage());
            System.out.println("Database URL: " + config.getDbUrl());
        };
    }
}

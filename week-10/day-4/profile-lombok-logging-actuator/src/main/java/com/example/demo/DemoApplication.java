package com.example.demo;

import com.example.demo.config.AppConfig;
import com.example.demo.service.MessageService;
import com.example.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(MessageService messageService, AppConfig cfg) {
        return args -> {
            log.info("Application started with active profile(s) and config:");
            log.info("MessageService says: {}", messageService.getMessage());
            log.info("App message from config: {}", cfg.getAppMessage());
            log.info("DB URL: {}", cfg.getDbUrl());

            // example Lombok-powered model usage
            User u = new User();
            u.setId(1L);
            u.setName("Jills Patel");
            log.info("Sample user: {}", u);
        };
    }
}

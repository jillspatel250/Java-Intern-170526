package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${app.message}")
    private String appMessage;

    @Value("${app.db-url}")
    private String dbUrl;

    public String getAppMessage() {
        return appMessage;
    }

    public String getDbUrl() {
        return dbUrl;
    }
}

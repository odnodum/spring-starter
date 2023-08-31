package com.dmdev.spring.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class JPAConfiguration {

    @PostConstruct
    void init() {
        System.out.println("JPA configuration is enabled");
    }
}

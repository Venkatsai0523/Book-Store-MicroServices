package com.microservices.catolog_service;

import org.springframework.boot.SpringApplication;

public class TestCatologServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(CatologServiceApplication::main)
                .with(TestcontainersConfiguration.class)
                .run(args);
    }
}

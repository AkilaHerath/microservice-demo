package com.example.app.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentServer {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "student-server");
        SpringApplication.run(StudentServer.class, args);
    }
}

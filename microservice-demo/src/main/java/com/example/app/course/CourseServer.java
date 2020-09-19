package com.example.app.course;
/*

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan
public class CourseServer {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "course-service");
        SpringApplication.run(CourseServer.class, args);
    }
}
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.logging.Logger;

@SpringBootApplication
@EnableDiscoveryClient
public class CourseServer {
    protected Logger logger = Logger.getLogger(CourseServer.class.getName());
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "course-server");
        SpringApplication.run(CourseServer.class, args);
    }
}

package com.example.app.student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "course-server")
public interface StudentClient {

    @GetMapping("/course")
    public StudentCourse getCourseDetials();
}

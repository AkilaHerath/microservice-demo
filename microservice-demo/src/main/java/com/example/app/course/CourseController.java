package com.example.app.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/course")
    public Course getCourseDetails() {
        Course course = courseService.getCourseDetail();
        return course;
    }
}

package com.example.app.course;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    public Course getCourseDetail() {
        Course course = new Course("Java fundamentals", "MIT2334", 04, "One year");
        return course;
    }
}

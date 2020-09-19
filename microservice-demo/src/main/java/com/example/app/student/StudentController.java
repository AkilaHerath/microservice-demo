package com.example.app.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentClient studentClient;

    @GetMapping("/student")
    public Student getStudentDetails() {
        Student student = studentService.getStudentDetails();
        return student;
    }

    @GetMapping("/studentcourse")
    public StudentCourse getStudentCourse() {
        return studentClient.getCourseDetials();
    }
}

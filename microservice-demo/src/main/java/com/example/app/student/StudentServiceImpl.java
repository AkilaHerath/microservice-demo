package com.example.app.student;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getStudentDetails() {
        Student student = new Student();
        student.setStudentName("Myka");
        student.setStudentNo("017");
        student.setAge(29);
        return student;
    }
}

package com.example.app.student;

public class StudentCourse {

    private String courseName;
    private String courseCode;
    private int numberOfCredits;
    private String courseDuration;

    public StudentCourse(String courseName, String courseCode, int numberOfCredits, String courseDuration) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.numberOfCredits = numberOfCredits;
        this.courseDuration = courseDuration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }
}

package com.example.app.course;

import java.util.Objects;

public class Course {

    private String courseName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return numberOfCredits == course.numberOfCredits &&
                Objects.equals(courseName, course.courseName) &&
                Objects.equals(courseCode, course.courseCode) &&
                Objects.equals(courseDuration, course.courseDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseCode, numberOfCredits, courseDuration);
    }

    private String courseCode;
    private int numberOfCredits;
    private String courseDuration;

    public Course(String courseName, String courseCode, int numberOfCredits, String courseDuration) {
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

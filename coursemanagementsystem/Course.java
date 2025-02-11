package com.tit.javagenerics.coursemanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courses;

    public Course() {
        courses = new ArrayList<>();
    }

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayDetails();
        }
    }
}

package com.tit.javagenerics.coursemanagementsystem;
import java.util.List;

public class UniversityCourseManagement {
    public static void main(String[] args) {
        // Create course categories
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Add courses
        examCourses.addCourse(new ExamCourse("Mathematics 101", 100));
        assignmentCourses.addCourse(new AssignmentCourse("History 201", 5));
        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence", "Deep Learning"));

        // Display all courses dynamically using wildcards
        System.out.println("University Courses:");
        Course.displayCourses(examCourses.getCourses());
        Course.displayCourses(assignmentCourses.getCourses());
        Course.displayCourses(researchCourses.getCourses());
    }
}

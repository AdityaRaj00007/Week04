package com.tit.javagenerics.coursemanagementsystem;
public abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract String getEvaluationMethod();

    public void displayDetails() {
        System.out.println("Course Name: " + courseName + "\nEvaluation Method: " + getEvaluationMethod());
        System.out.println("___________________________________________________________________");
    }
}

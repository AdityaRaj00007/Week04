package com.tit.javagenerics.coursemanagementsystem;
public class AssignmentCourse extends CourseType {
    private int numberOfAssignments;

    public AssignmentCourse(String courseName, int numberOfAssignments) {
        super(courseName);
        this.numberOfAssignments = numberOfAssignments;
    }

    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based (Number of Assignments: " + numberOfAssignments + ")";
    }
}

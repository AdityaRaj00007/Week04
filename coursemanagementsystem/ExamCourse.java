package com.tit.javagenerics.coursemanagementsystem;
public class ExamCourse extends CourseType {
    private int totalMarks;

    public ExamCourse(String courseName, int totalMarks) {
        super(courseName);
        this.totalMarks = totalMarks;
    }

    @Override
    public String getEvaluationMethod() {
        return "Exam-Based (Total Marks: " + totalMarks + ")";
    }
}

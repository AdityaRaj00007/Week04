package com.tit.javagenerics.coursemanagementsystem;
public class ResearchCourse extends CourseType {
    private String researchArea;

    public ResearchCourse(String courseName, String researchArea) {
        super(courseName);
        this.researchArea = researchArea;
    }

    @Override
    public String getEvaluationMethod() {
        return "Research-Based (Research Area: " + researchArea + ")";
    }
}

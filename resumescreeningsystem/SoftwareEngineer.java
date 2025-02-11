package com.tit.javagenerics.resumescreeningsystem;
public class SoftwareEngineer extends JobRole {
    private int codingExperienceYears;

    public SoftwareEngineer(String candidateName, int codingExperienceYears) {
        super(candidateName);
        this.codingExperienceYears = codingExperienceYears;
    }

    @Override
    public String getJobRole() {
        return "Software Engineer";
    }

    @Override
    public boolean screenCandidate() {
        return codingExperienceYears >= 2;  // Sample screening criteria
    }
}

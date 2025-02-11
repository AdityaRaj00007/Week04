package com.tit.javagenerics.resumescreeningsystem;
public class DataScientist extends JobRole {
    private boolean hasMLExperience;

    public DataScientist(String candidateName, boolean hasMLExperience) {
        super(candidateName);
        this.hasMLExperience = hasMLExperience;
    }

    @Override
    public String getJobRole() {
        return "Data Scientist";
    }

    @Override
    public boolean screenCandidate() {
        return hasMLExperience;  // Sample screening criteria
    }
}

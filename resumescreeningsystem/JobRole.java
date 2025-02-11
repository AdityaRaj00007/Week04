package com.tit.javagenerics.resumescreeningsystem;
public abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String getJobRole();

    public abstract boolean screenCandidate();

    public void displayDetails() {
        System.out.println("Candidate Name: " + candidateName + "\nJob Role: " + getJobRole());

    }
}

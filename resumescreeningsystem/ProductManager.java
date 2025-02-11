package com.tit.javagenerics.resumescreeningsystem;
public class ProductManager extends JobRole {
    private int projectManagementExperienceYears;

    public ProductManager(String candidateName, int projectManagementExperienceYears) {
        super(candidateName);
        this.projectManagementExperienceYears = projectManagementExperienceYears;
    }

    @Override
    public String getJobRole() {
        return "Product Manager";
    }

    @Override
    public boolean screenCandidate() {
        return projectManagementExperienceYears >= 3;  // Sample screening criteria
    }
}

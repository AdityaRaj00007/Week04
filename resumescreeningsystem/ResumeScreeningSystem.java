package com.tit.javagenerics.resumescreeningsystem;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Create resume categories
        Resume<SoftwareEngineer> softwareResumes = new Resume<>();
        Resume<DataScientist> dataScienceResumes = new Resume<>();
        Resume<ProductManager> productManagerResumes = new Resume<>();

        // Add candidates
        softwareResumes.addCandidate(new SoftwareEngineer("Aditya Raj Gupta", 3));
        dataScienceResumes.addCandidate(new DataScientist("Ankit Gangwani", true));
        productManagerResumes.addCandidate(new ProductManager("Aadarsh Gupta", 2));

        // Process resumes dynamically using wildcards
        System.out.println("Resume Screening Results:");
        Resume.processResumes(softwareResumes.getCandidates());
        System.out.println("________________________________________");
        Resume.processResumes(dataScienceResumes.getCandidates());
        System.out.println("________________________________________");
        Resume.processResumes(productManagerResumes.getCandidates());
    }
}

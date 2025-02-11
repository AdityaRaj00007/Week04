package com.tit.javagenerics.resumescreeningsystem;
import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    private List<T> candidates;

    public Resume() {
        candidates = new ArrayList<>();
    }

    public void addCandidate(T candidate) {
        candidates.add(candidate);
    }

    public List<T> getCandidates() {
        return candidates;
    }

    public static void processResumes(List<? extends JobRole> jobRoles) {
        for (JobRole jobRole : jobRoles) {
            jobRole.displayDetails();
            if (jobRole.screenCandidate()) {
                System.out.println("Status: Resume Passed Screening\n");
            } else {
                System.out.println("Status: Resume Failed Screening\n");
            }
        }
    }
}

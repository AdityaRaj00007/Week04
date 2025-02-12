package com.tit.collections.insurancepolicymanagementsystem;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsurancePolicyManagement {

    private Set<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSetPolicies = new TreeSet<>();

    // Add policy to all sets
    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    // Display all unique policies
    public void displayAllPolicies(Set<InsurancePolicy> policySet, String setType) {
        System.out.println("Policies in " + setType + ":");
        for (InsurancePolicy policy : policySet) {
            System.out.println(policy);
        }
        System.out.println();
    }

    // Display policies expiring within the next 30 days
    public void displayExpiringSoonPolicies() {
        System.out.println("Policies Expiring Soon (within 30 days):");
        LocalDate currentDate = LocalDate.now();
        for (InsurancePolicy policy : treeSetPolicies) {
            long daysUntilExpiry = ChronoUnit.DAYS.between(currentDate, policy.getExpiryDate());
            if (daysUntilExpiry >= 0 && daysUntilExpiry <= 30) {
                System.out.println(policy);
            }
        }
        System.out.println();
    }

    // Display policies with a specific coverage type
    public void displayPoliciesByCoverageType(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
        System.out.println();
    }

    // Find and display duplicate policies based on policy numbers
    public void displayDuplicatePolicies() {
        System.out.println("Duplicate Policies:");
        Map<String, Integer> policyNumberFrequency = new HashMap<>();

        for (InsurancePolicy policy : hashSetPolicies) {
            policyNumberFrequency.put(policy.getPolicyNumber(), policyNumberFrequency.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : policyNumberFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Policy Number: " + entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();

        // Sample policies
        InsurancePolicy policy1 = new InsurancePolicy("P1001", "Aditya Raj Gupta", LocalDate.now().plusDays(10), "Health", 500.00);
        InsurancePolicy policy2 = new InsurancePolicy("P1002", "Ankit Gangwani", LocalDate.now().plusDays(40), "Auto", 800.00);
        InsurancePolicy policy3 = new InsurancePolicy("P1003", "Darshan Yadav", LocalDate.now().plusDays(5), "Home", 1200.00);
        InsurancePolicy policy4 = new InsurancePolicy("P1001", "Aadarsh Gupta", LocalDate.now().plusDays(10), "Health", 500.00); // Duplicate

        // Add policies
        system.addPolicy(policy1);
        system.addPolicy(policy2);
        system.addPolicy(policy3);
        system.addPolicy(policy4);

        // Display policies from different sets
        system.displayAllPolicies(system.hashSetPolicies, "HashSet");
        system.displayAllPolicies(system.linkedHashSetPolicies, "LinkedHashSet");
        system.displayAllPolicies(system.treeSetPolicies, "TreeSet");

        // Display policies expiring soon
        system.displayExpiringSoonPolicies();

        // Display policies by coverage type
        system.displayPoliciesByCoverageType("Health");

        // Display duplicate policies
        system.displayDuplicatePolicies();
    }
}

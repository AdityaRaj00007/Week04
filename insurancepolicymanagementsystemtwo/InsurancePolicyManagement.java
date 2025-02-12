package com.tit.collections.insurancepolicymanagementsystemtwo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class InsurancePolicyManagement {
    private Map<String, Policy> policyMap;           // Fast lookup by policy number
    private Map<String, Policy> orderedPolicies;     // Maintain insertion order
    private TreeMap<LocalDate, Policy> sortedByExpiry; // Sort by expiry date

    public InsurancePolicyManagement() {
        this.policyMap = new HashMap<>();
        this.orderedPolicies = new LinkedHashMap<>();
        this.sortedByExpiry = new TreeMap<>();
    }

    // Add a policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicies.put(policy.getPolicyNumber(), policy);
        sortedByExpiry.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by its number
    public Policy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List policies expiring within the next 30 days
    public List<Policy> getExpiringPolicies() {
        List<Policy> expiring = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for (Map.Entry<LocalDate, Policy> entry : sortedByExpiry.entrySet()) {
            if (ChronoUnit.DAYS.between(today, entry.getKey()) <= 30) {
                expiring.add(entry.getValue());
            }
        }
        return expiring;
    }

    // List policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(holderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, Policy>> iterator = sortedByExpiry.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<LocalDate, Policy> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                Policy expiredPolicy = entry.getValue();
                policyMap.remove(expiredPolicy.getPolicyNumber());
                orderedPolicies.remove(expiredPolicy.getPolicyNumber());
                iterator.remove();
            }
        }
    }

    // Display all policies
    public void displayAllPolicies() {
        for (Policy policy : orderedPolicies.values()) {
            System.out.println(policy);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        InsurancePolicyManagement manager = new InsurancePolicyManagement();

        // Adding policies
        manager.addPolicy(new Policy("P101", "Aditya", LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new Policy("P102", "Aadarsh", LocalDate.now().plusDays(40), "Auto", 3000));
        manager.addPolicy(new Policy("P103", "Ankit", LocalDate.now().minusDays(5), "Home", 7000));

        // Display all policies
        System.out.println("All Policies:");
        manager.displayAllPolicies();

        // Get expiring policies
        System.out.println("\nExpiring Policies (Next 30 Days):");
        for (Policy p : manager.getExpiringPolicies()) {
            System.out.println(p);
        }

        // Get policies for a specific holder
        System.out.println("\nPolicies for Alice:");
        for (Policy p : manager.getPoliciesByHolder("Alice")) {
            System.out.println(p);
        }

        // Remove expired policies
        manager.removeExpiredPolicies();
        System.out.println("\nAfter Removing Expired Policies:");
        manager.displayAllPolicies();
    }
}

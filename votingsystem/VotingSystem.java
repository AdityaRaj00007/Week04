package com.tit.collections.votingsystem;
import java.util.*;
public class VotingSystem {
    private Map<String, Integer> voteMap;          // Stores votes (Candidate -> Votes)
    private Map<String, Integer> orderedVotes;     // Maintains the order of voting
    private TreeMap<String, Integer> sortedVotes;  // Displays results in sorted order

    public VotingSystem() {
        this.voteMap = new HashMap<>();
        this.orderedVotes = new LinkedHashMap<>();
        this.sortedVotes = new TreeMap<>();
    }

    // Method to cast a vote
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, voteMap.get(candidate));
        sortedVotes.put(candidate, voteMap.get(candidate));
    }

    // Display votes in insertion order
    public void displayVotesInOrder() {
        System.out.println("\nVotes in Order of Voting:");
        for (Map.Entry<String, Integer> entry : orderedVotes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    // Display votes sorted alphabetically
    public void displaySortedVotes() {
        System.out.println("\nVotes Sorted by Candidate Name:");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    // Display final results (winner)
    public void displayWinner() {
        String winner = Collections.max(voteMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nWinner: " + winner + " with " + voteMap.get(winner) + " votes!");
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        system.castVote("Aditya");
        system.castVote("Aadarsh");
        system.castVote("Aditya");
        system.castVote("Ankit");
        system.castVote("Aditya");
        system.castVote("Darshan");

        system.displayVotesInOrder();
        system.displaySortedVotes();
        system.displayWinner();
    }
}

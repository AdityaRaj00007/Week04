package com.tit.collections.bankingsystem;
import java.util.*;

class BankingSystem {
    private Map<Integer, Double> accountBalances; // Store account balances
    private TreeMap<Double, List<Integer>> sortedAccounts; // Sort accounts by balance
    private Queue<WithdrawalRequest> withdrawalQueue; // Queue for withdrawal requests

    public BankingSystem() {
        this.accountBalances = new HashMap<>();
        this.sortedAccounts = new TreeMap<>();
        this.withdrawalQueue = new LinkedList<>();
    }

    // Add a new account
    public void addAccount(int accountNumber, double initialBalance) {
        accountBalances.put(accountNumber, initialBalance);
        sortedAccounts.computeIfAbsent(initialBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    // Display all accounts sorted by balance
    public void displayAccountsByBalance() {
        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, List<Integer>> entry : sortedAccounts.entrySet()) {
            for (Integer account : entry.getValue()) {
                System.out.println("Account " + account + " -> $" + entry.getKey());
            }
        }
    }

    // Request a withdrawal
    public void requestWithdrawal(int accountNumber, double amount) {
        if (!accountBalances.containsKey(accountNumber)) {
            System.out.println("Account " + accountNumber + " not found!");
            return;
        }
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
        System.out.println("Withdrawal request added for Account " + accountNumber + " ($" + amount + ")");
    }

    // Process withdrawals in FIFO order
    public void processWithdrawals() {
        System.out.println("\nProcessing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            int accountNumber = request.getAccountNumber();
            double amount = request.getAmount();

            if (accountBalances.get(accountNumber) >= amount) {
                accountBalances.put(accountNumber, accountBalances.get(accountNumber) - amount);
                System.out.println("Withdrawn $" + amount + " from Account " + accountNumber);
            } else {
                System.out.println("Insufficient funds in Account " + accountNumber);
            }
        }
    }

    // Inner class for withdrawal requests
    static class WithdrawalRequest {
        private int accountNumber;
        private double amount;

        public WithdrawalRequest(int accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public double getAmount() {
            return amount;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount(101, 5000.00);
        bank.addAccount(102, 3000.00);
        bank.addAccount(103, 7000.00);

        // Display accounts sorted by balance
        bank.displayAccountsByBalance();

        // Request withdrawals
        bank.requestWithdrawal(101, 2000.00);
        bank.requestWithdrawal(102, 3500.00); // Should fail (insufficient funds)
        bank.requestWithdrawal(103, 1000.00);

        // Process withdrawals
        bank.processWithdrawals();

        // Display updated accounts
        bank.displayAccountsByBalance();
    }
}

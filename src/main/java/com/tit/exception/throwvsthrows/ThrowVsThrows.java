package com.tit.exception.throwvsthrows;

public class ThrowVsThrows {
    public static void main(String[] args) {
        try{
            calculateInterest(5000,5,5);
            calculateInterest(-5000,-5,5);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Excecution Completed ");
        }
    }
    static void calculateInterest(double amount , double rate , int years)throws IllegalArgumentException{
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive ");
        }
        System.out.println((amount*rate*years)/100);
    }
}

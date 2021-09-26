package com.company;

import java.util.Objects;
import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private final long accountNumber;
    public static double totalAmountInBank = 0;
    public static int numberOfAccounts = 0;

    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
        this.accountNumber =  getAccountNumber();
    }

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        totalAmountInBank += (this.checkingBalance + this.savingsBalance);
        this.accountNumber = getAccountNumber() ;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        double balanceDifference = (checkingBalance - this.checkingBalance);
        this.checkingBalance = checkingBalance;
        totalAmountInBank += balanceDifference;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        double balanceDifference = (savingsBalance - this.savingsBalance);
        this.savingsBalance = savingsBalance;
        totalAmountInBank += balanceDifference;
    }

    public void deposit(String accountName, double amount) {
        if (Objects.equals(accountName, "checking")) {
            setCheckingBalance((this.checkingBalance + amount));
        } else if (Objects.equals(accountName, "savings")) {
            setSavingsBalance((this.savingsBalance + amount));
        } else {
            System.out.println("Please enter 'checking' or 'savings' for first arg and double for second");
        }

    }

    public void withdraw(String accountName, double amount) {

        if (Objects.equals(accountName, "checking")) {
            if (this.checkingBalance - amount >= 0) {
                setCheckingBalance((this.checkingBalance - amount));
            } else {
                System.out.println("Insufficient funds");
            }
        } else if (Objects.equals(accountName, "savings")) {
            if (this.savingsBalance - amount >= 0) {

                setSavingsBalance((this.savingsBalance - amount));
            } else {
                System.out.println("Insufficient Funds");
            }
        } else {
            System.out.println("Please enter 'checking' or 'savings' for first arg and double for second");
        }

    }

    public String toString(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Checking Balance: "+ String.format("$%.2f", this.checkingBalance));
        System.out.println("Savings Balance: "+ String.format("$%.2f", this.savingsBalance));
        System.out.println("Account Number: " + this.accountNumber);
        return null;
    }
    public static double getTotalAmountInBank() {
        return totalAmountInBank;
    }

    private long getAccountNumber() {
        long accountNumber = 0;
        Random randomGenerator = new Random();
        for (int i = 0; i < 9; i++) {
           accountNumber += (randomGenerator.nextInt(9)+ 1);
           accountNumber*=10;
        }
        return accountNumber;
    }
}

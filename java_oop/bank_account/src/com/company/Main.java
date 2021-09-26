package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(3.00, 4.00);
        BankAccount account2 = new BankAccount();
        System.out.println(BankAccount.getTotalAmountInBank());
        account1.setCheckingBalance(2.00);
        account1.setSavingsBalance(2.00);


        account1.deposit("savings", 2.40);
        account1.withdraw("checking", 2.00);



        System.out.println(BankAccount.getTotalAmountInBank());
        System.out.println(account1);
        System.out.println(account2);
    }
}

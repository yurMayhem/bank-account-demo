package com.example;

public class App {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rahul", 1000);
        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Opening balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("After deposit of 500: " + account.getBalance());

        account.withdraw(200);
        System.out.println("After withdrawal of 200: " + account.getBalance());

        System.out.println("Final balance enquiry: " + account.getBalance());
    }
}
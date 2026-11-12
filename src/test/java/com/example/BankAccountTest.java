package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testInitialBalance() {
        BankAccount account = new BankAccount("Rahul", 1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("Rahul", 1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("Rahul", 1000);
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }

    @Test
    public void testBalanceUpdatesAfterMultipleTransactions() {
        BankAccount account = new BankAccount("Rahul", 1000);
        account.deposit(500);
        account.withdraw(200);
        assertEquals(1300, account.getBalance());
    }

    @Test
    public void testInsufficientBalance() {
        BankAccount account = new BankAccount("Rahul", 1000);
        assertThrows(IllegalStateException.class, () -> account.withdraw(2000));
        assertEquals(1000, account.getBalance());   // balance must stay unchanged
    }

    @Test
    public void testInvalidDeposit() {
        BankAccount account = new BankAccount("Rahul", 1000);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
    }

    @Test
    public void testInvalidWithdrawal() {
        BankAccount account = new BankAccount("Rahul", 1000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0));
    }
}
package de.ait.homework28.homework28ex3;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10, 1000, 1234);
        bankAccount.checkBalance();
        bankAccount.deposit(100);
        bankAccount.withdraw(2000, 1233);
        bankAccount.withdraw(600, 1234);
        bankAccount.withdraw(500, 1234);
        bankAccount.withdraw(200,1234);
    }
}

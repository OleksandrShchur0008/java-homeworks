package de.ait.homework48;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("3", "Max");
        bankAccount.getOwnerName();
        bankAccount.getBalance();
        bankAccount.withdraw(200);
        bankAccount.deposit(1000);
        bankAccount.withdraw(100);
    }
}

package de.ait.homework43;

public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount bankAccountMy = new BankAccount("Shoni", 5);
        bankAccountMy.deposit(2);
        System.out.println("-----");
        bankAccountMy.deposit(100.50);
        System.out.println("-----");
        bankAccountMy.withdraw(45);
        System.out.println("-----");
        System.out.println(bankAccountMy.checkBalance());
    }
}

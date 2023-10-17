package de.ait.homework28.homework28ex3;

public class BankAccount {
    private int accountNumber;

    private double balance;

    private int pinCode;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Your balance now is: " + balance + " Euro.");
        } else {
            System.err.println("Incorrect amount to deposit.");
        }
    }

    public void withdraw(double amount, int currentPinCode) {
        if (currentPinCode == pinCode) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Your balance now is: " + balance + " Euro.");
            } else {
                System.out.println("Incorrect amount to withdraw");
            }
        } else {
            System.err.println("Incorrect pinCode");
        }
    }

    public void checkBalance() {
        System.out.println("Your balance now is: " + balance + " Euro.");
    }

    public void setPinCode(int currentPinCode, int pinCode) {
        if (currentPinCode == pinCode) {
            this.pinCode = pinCode;
            System.out.println("Your pin now is: " + pinCode);
        } else {
            System.out.println("Incorrect pin. Try again.");
        }
    }

    public BankAccount(int accountNumber, double balance, int pinCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pinCode = pinCode;
    }


}

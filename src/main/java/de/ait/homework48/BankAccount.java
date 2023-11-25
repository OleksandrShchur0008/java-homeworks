package de.ait.homework48;

import de.ait.homework48.Exceptions48.InsufficientFundsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        try {
            if (amount < 1.99) {
                throw new IllegalArgumentException("Amount must be min 2 EUR.");
            }
            balance += amount;
            LOGGER.info("{} successfully deposited {} EUR. Current balance: {}.", getOwnerName(), amount, getBalance());
        } catch (IllegalArgumentException illegalArgumentException) {
            LOGGER.error("Incorrect amount to deposit ({} - less than 2 EUR).", amount);
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount < 0) {
                LOGGER.error("Incorrect amount to withdraw ({} - is Negative).", amount);
                throw new IllegalArgumentException("Amount must be not negative");
            }
            if (amount > balance) {
                throw new InsufficientFundsException(balance, amount);
            }
            balance -= amount;
            LOGGER.info("{} successfully withdrawn {} EUR. Current balance: {}.", getOwnerName(), amount, getBalance());
        } catch (InsufficientFundsException insufficientFundsException) {
            LOGGER.error("Incorrect amount to withdraw ({} - is MORE than user has on his balance).", amount);
        }
    }

    public double getBalance() {
        System.out.println("Current balance: " + balance);
        return balance;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}



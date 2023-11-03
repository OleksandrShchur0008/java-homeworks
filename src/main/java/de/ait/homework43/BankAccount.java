package de.ait.homework43;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

    private String owner;

    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount >= 5) {
            balance += amount;
            LOGGER.info("Your balance now is: {} Euro.", balance);
        } else {
            LOGGER.error("Unacceptable amount to deposit! (min 5 Euro)");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            LOGGER.info("Your balance now is: {} Euro.", balance);
        } else {
            LOGGER.error("Unacceptable amount to withdraw! Your balance: {} Euro.", balance);
        }
    }

    public double checkBalance() {
        LOGGER.debug("Account owner: {} balance requested.", owner);
        return balance;
    }
}

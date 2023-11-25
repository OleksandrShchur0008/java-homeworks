package de.ait.homework48.Exceptions48;

public class InsufficientFundsException extends RuntimeException {

    private double balance;
    private double requestedAmount;

    public InsufficientFundsException(double balance, double requestedAmount) {
        super("Insufficient funds. Balance: " + balance + ", Requested amount: " + requestedAmount);
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}

package de.ait.homework27;

public class Groceries extends Product {

    private String expirationDate;

    public Groceries(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getInfo() {
        return "NAME: " + getName() + "\nPRICE: " + getPrice() + "\nQUANTITY: "
                + getQuantity() + "\nEXPIRATION DATE: " + expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}

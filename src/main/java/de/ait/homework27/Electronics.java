package de.ait.homework27;

public class Electronics extends Product {

    private int warrantyYears;

    public Electronics(String name, double price, int quantity, int warrantyYears) {
        super(name, price, quantity);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String getInfo() {
        return "NAME: " + getName() + "\nPRICE: " + getPrice() + "\nQUANTITY: "
                + getQuantity() + "\nWARRANTY YEARS: " + warrantyYears;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }
}

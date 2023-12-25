package de.ait.softwareOffice;

abstract class Employee {

    private String name;
    private String address;
    private String number;

    public Employee(String name, String address, String number) {
        System.out.println("Call constructor Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public float computePay() {
        return 0;
    }

    public void mailSalarySlip() {
        System.out.println("Invoice has sent to " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

package de.ait.softwareOffice;

public class Salary extends Employee {

    private float salary;

    public Salary(String name, String address, String number, float salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float newSalary) {
        this.salary = newSalary;
    }

    public float computePay() {
        System.out.println("Counting salary for " + getName());
        return salary * 12;
    }

    public void mailSalarySlip() {
        System.out.println("Invoice has sent to " + getName() +
                " salary in 1 year" + salary + " salary in 1 month " + getSalaryMonth(salary));
    }

    public float getSalaryMonth(float salary) {
        return salary/12;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}

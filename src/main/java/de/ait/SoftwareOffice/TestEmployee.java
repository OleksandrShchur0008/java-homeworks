package de.ait.SoftwareOffice;

public class TestEmployee {
    public static void main(String[] args) {
        Salary salary = new Salary("Zaycev", "Berlin", "1", 50000);
        salary.mailSalarySlip();
        System.out.println(salary.toString());

        salary.setSalary(60000);
        salary.mailSalarySlip();
        System.out.println(salary.toString());
    }
}

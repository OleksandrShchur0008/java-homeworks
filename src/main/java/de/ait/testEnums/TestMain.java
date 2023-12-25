package de.ait.testEnums;

public class TestMain {
    public static void main(String[] args) {

        DayUtil today = new DayUtil(29, Day.WEDNESDAY);
        System.out.println(today.getDayOfTheWeek());
    }
}

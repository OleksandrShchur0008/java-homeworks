package de.ait.softwareHolidayCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HolidayApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HolidayCalendar holidayCalendar = new HolidayCalendar();

        HolidayUpdater holidayUpdater = new HolidayUpdater(holidayCalendar);
        HolidayNotifier holidayNotifier = new HolidayNotifier(holidayCalendar);

        holidayUpdater.start();
        holidayNotifier.start();

        while(true) {

            System.out.println("Welcome to Holiday Application.");
            System.out.println("Enter 1 to add new Holiday.");
            System.out.println("Enter 2 to remove a Holiday.");
            System.out.println("Enter 3 to see all your Holidays.");
            System.out.println("Enter 4 to quit.");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter holiday name: ");
                    String holidayName = scanner.nextLine();
                    System.out.println("Enter holiday date: dd-MM-yyyy");
                    String dateString = scanner.nextLine();

                    try {
                        Date holidayDate = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
                        holidayCalendar.addHoliday(new Holiday(holidayName, holidayDate));
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Use dd-MM-yyyy.");
                    }
                    break;

                case 2:
                    System.out.print("Enter holiday name to remove it: ");
                    String holidayToRemove = scanner.nextLine();
                    for (Holiday holiday : holidayCalendar.getHolidays()) {
                        if (holiday.getName().equalsIgnoreCase(holidayToRemove)) {
                            holidayCalendar.removeHoliday(holiday);
                        } else {
                            System.out.println("Holiday not found.");
                        }
                    }
                    break;

                case 3:
                    holidayCalendar.printAllHolidays();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}

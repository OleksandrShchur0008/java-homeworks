package de.ait.softwareHolidayCalendar;

import java.util.ArrayList;
import java.util.List;

public class HolidayCalendar {

    List<Holiday> holidays = new ArrayList<>();

    public synchronized void addHoliday(Holiday holidayNew) {
        holidays.add(holidayNew);
        System.out.println("Added holiday: " + holidayNew.getName());
    }

    public synchronized void removeHoliday(Holiday holidayToRemove) {
        holidays.remove(holidayToRemove);
        System.out.println("Removed holiday: " + holidayToRemove.getName());
    }

    public void printAllHolidays() {
        if (!holidays.isEmpty()) {
            for (Holiday holiday : holidays) {
                System.out.println(holiday);
            }
        }
    }

    public List<Holiday> getHolidays() {
        return new ArrayList<>(holidays);
    }

}

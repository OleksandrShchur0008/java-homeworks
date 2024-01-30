package de.ait.softwareHolidayCalendar;

public class HolidayNotifier extends Thread {

    private HolidayCalendar holidayCalendar;

    public HolidayNotifier(HolidayCalendar holidayCalendar) {
        this.holidayCalendar = holidayCalendar;
    }

    @Override
    public void run() {

    }
}

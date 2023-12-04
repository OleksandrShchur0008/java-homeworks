package de.ait.zenums;

public class DayUtil {

    int dayOfTheMonth;

    Day dayOfTheWeek;

    public DayUtil(int dayOfTheMonth, Day dayOfTheWeek) {
        this.dayOfTheMonth = dayOfTheMonth;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public int getDayOfTheMonth() {
        return dayOfTheMonth;
    }

    public void setDayOfTheMonth(int dayOfTheMonth) {
        this.dayOfTheMonth = dayOfTheMonth;
    }

    public Day getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(Day dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }
}

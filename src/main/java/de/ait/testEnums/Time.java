package de.ait.testEnums;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Time {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 4, 5);
        LocalDate localDate1 = LocalDate.now();

        long result = ChronoUnit.DAYS.between(localDate1, localDate);
        System.out.println(result);

        ZoneId zoneIdParis = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTimeParis = ZonedDateTime.now(zoneIdParis);
        System.out.println(zonedDateTimeParis);

    }


    public static boolean checkYear (LocalDate localDate) {
        if (localDate.getMonth().equals(Month.FEBRUARY) && localDate.getDayOfMonth()==29) {
            return true;
        } else {
            if (localDate.getYear() % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}

package de.ait.testTimeApi;

import java.time.LocalTime;

public class LocalTimeUtil {

    public static void main(String[] args) {
        LocalTime localTime  = LocalTime.now();
        System.out.println(localTime);


        LocalTime time = LocalTime.of(20,00,00);
        time = time.plusHours(2);
        time = time.minusHours(1);
        time = time.plusSeconds(3000);
        System.out.println(time);

        LocalTime timeFromSeconds = LocalTime.ofSecondOfDay(3000);
        System.out.println(timeFromSeconds);
        System.out.println(time.getMinute());
        System.out.println(time.getHour());

    }
}

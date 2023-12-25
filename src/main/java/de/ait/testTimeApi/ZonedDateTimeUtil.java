package de.ait.testTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeUtil {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        /**for (String zoneId: ZoneId.getAvailableZoneIds()){
            System.out.println(zoneId);
        }*/

        ZoneId zoneIdUSEastern = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTimeUSEastern = ZonedDateTime.now(zoneIdUSEastern);
        System.out.println(zonedDateTimeUSEastern);
        System.out.println(zonedDateTimeUSEastern.getZone());
        System.out.println(zonedDateTimeUSEastern.getMonthValue());
        System.out.println(zonedDateTimeUSEastern.getOffset());
        System.out.println(zonedDateTimeUSEastern.getDayOfYear());
        System.out.println(zonedDateTimeUSEastern.minusDays(800));
    }
}

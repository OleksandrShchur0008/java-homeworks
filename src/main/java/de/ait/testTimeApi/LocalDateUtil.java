package de.ait.testTimeApi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateUtil {

    public static void main(String[] args) {
        LocalDate localDateGermany = LocalDate.now();
        System.out.println("localDateGermany --> " + localDateGermany);

        ZoneId zoneId = ZoneId.of("Australia/Darwin");
        LocalDate localDateAustralia = LocalDate.now(zoneId);
        LocalDate localDateAfrica = LocalDate.now(ZoneId.of("Africa/Addis_Ababa"));
        System.out.println("localDateAustralia -->" + localDateAustralia);
        System.out.println("localDateAfrica -->" + localDateAfrica);

        LocalDate localDateOf2000 = LocalDate.of(2000, 4, 5);
        System.out.println(localDateOf2000);

        LocalDate localDate = LocalDate.ofYearDay(2000,01);
        System.out.println(localDate);

        System.out.println(localDate.getYear());
        System.out.println("-----------");

        localDate = localDate.plusDays(57);
        System.out.println(localDate);
        localDate = localDate.minusDays(17);
        System.out.println(localDate);

        String pattern = "dd.MM.yyyy";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(dateTimeFormatter.format(localDate));
        DateTimeFormatter dateTimeFormatterISO = DateTimeFormatter.ISO_DATE;
        System.out.println(LocalDate.now().format(dateTimeFormatterISO));


        //TODO
        String dateToParse = "2020-10-10";
        LocalDate localDateParsed = LocalDate.parse(dateToParse, dateTimeFormatter);
        DateTimeFormatter dateTimeFormatterGermany = DateTimeFormatter.ofPattern(dateToParse, Locale.ENGLISH);
        System.out.println("dateTimeFormatterGermany-->" + LocalDate.parse(dateToParse, dateTimeFormatterGermany));
        System.out.println(localDateParsed.minusDays(800));


    }
}

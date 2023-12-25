package de.ait.testTimeApi;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class AufgabenTimeAPI {
    public static void main(String[] args) {
        //Используя Java Time API, добавьте 5 дней
        // и 3 месяца к текущей дате и выведите результат.
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plusDays(5).plusMonths(3));

        //напишите код на Java, который создает объект `LocalDateTime`
        // для "1 января 2023 года, 12:00" и выводит его в консоль.
        LocalDateTime localDateTime = LocalDateTime.of(2023, 1,
                1, 12,00);
        System.out.println(localDateTime);

        //Напишите функцию на Java, которая принимает два объекта
        // `LocalDate` и возвращает количество дней между ними.
        LocalDate localDateOne = LocalDate.of(2030, 01,01);
        LocalDate localDateTwo = LocalDate.now();
        long result = ChronoUnit.DAYS.between(localDateTwo, localDateOne);
        System.out.println(result);



        //Напишите функцию, которая возвращает `true`,
        // если переданная дата (`LocalDate`) является високосным годом.
        System.out.println(checkYear(LocalDate.now().plusYears(1)));
        System.out.println(checkYearNew(LocalDate.now().plusYears(1)));


        //использовать `ZonedDateTime` в Java для создания метки
        // времени с учетом временной зоны "Europe/Paris"
        ZoneId zoneIdEuropeParis = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTimeParis = ZonedDateTime.now(zoneIdEuropeParis);
        System.out.println("Europe/Paris --> " + zonedDateTimeParis);
    }

    public static boolean checkYear(LocalDate localDate){
        if(localDate.getMonth().equals(Month.FEBRUARY) && localDate.getDayOfMonth()==29){
            return true;
        }
        else {
            return localDate.getYear() % 4 == 0;
        }
    }

    public static boolean checkYearNew(LocalDate localDate){
        return localDate.isLeapYear();
    }

}

package de.ait.homework56;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TestEventScheduler {

    private static EventScheduler eventScheduler = new EventScheduler();

    public static void main(String[] args) {

        Event eventSaintNicolaus = new Event("Saint Nicolaus",
                LocalDateTime.of(2023, 12, 5, 23,59,0),
                LocalDateTime.of(2023, 12,6,23,59,0));

        Event eventNewYear = new Event("New Year",
                LocalDateTime.of(2023, 12, 31, 23,0,0),
                LocalDateTime.of(2024, 1,1,1,0,0));

        Event eventMeetingWithJuli = new Event("Meeting with Juli",
                LocalDateTime.of(2023, 12, 6, 12,0,0),
                LocalDateTime.of(2023, 12,6,14,0,0));

        eventScheduler.addEvent(eventSaintNicolaus);
        eventScheduler.addEvent(eventNewYear);
        eventScheduler.addEvent(eventMeetingWithJuli);

        List<Event> eventsList = eventScheduler.getEventList();
        for(Event event : eventsList) {
            System.out.println(event.toString());
        }

        System.out.println("-------------------------");

        LocalDateTime localDateTime = LocalDateTime.of(2023, 12 , 1,12,0,0);
        List<Event> listForLocalDateTime = eventScheduler.getEventsOfDate(localDateTime);
        for (Event event : listForLocalDateTime) {
            System.out.println(event.toString());
        }

        System.out.println("-------------------------");

        LocalDateTime localDateTimeSecond = LocalDateTime.of(2023, 12 , 6,13,0,0);
        List<Event> listForLocalDateTimeSecond = eventScheduler.getEventsOfDate(localDateTimeSecond);
        for (Event event : listForLocalDateTimeSecond) {
            System.out.println(event.toString());
        }


    }
}

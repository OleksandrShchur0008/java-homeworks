package de.ait.homework56;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventScheduler {

    private List<Event> eventList;

    public EventScheduler() {
        this.eventList = new ArrayList<>();
    }

    public void addEvent(Event eventToAdd) {
        eventList.add(eventToAdd);
    }

    public void removeEvent(Event eventToRemove) {
        eventList.remove(eventToRemove);
    }

    public List<Event> getEventsOfDate(LocalDateTime localDateTime) {
        List<Event> foundEvents = new ArrayList<>();
        for (Event event : eventList) {
            if (event.getStartDateTime().equals(localDateTime)) {
                foundEvents.add(event);
            } else {
                System.out.println("Nothing was found");
            }
        }
        return foundEvents;
    }

    /* public List<Event> getEventsOfDate2(LocalDate localDate) {
        List<Event> foundEvents = new ArrayList<>();
        for (Event event : eventList) {
            if (event.getStartDateTime().getDayOfMonth() == localDate.getDayOfMonth() &&
                    event.getStartDateTime().getMonth() == localDate.getMonth() &&
                    event.getStartDateTime().getYear() == localDate.getYear()) {
                foundEvents.add(event);
            }
        }
        return foundEvents;
    } */

    public boolean checkEventsToOverLaps(Event firstEvent, Event secondEvent) {
        return firstEvent.getStartDateTime().isBefore(secondEvent.getEndDateTime()) &&
                secondEvent.getStartDateTime().isBefore(firstEvent.getEndDateTime());
    }

    public List<Event> getEventList() {
        return new ArrayList<>(eventList);
    }
}

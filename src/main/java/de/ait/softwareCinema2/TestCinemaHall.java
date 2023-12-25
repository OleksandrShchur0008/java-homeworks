package de.ait.softwareCinema2;

import de.ait.softwareCinema2.Exceptions.ScheduleConflictException;
import de.ait.softwareCinema2.Exceptions.SoldOutException;

import java.time.LocalDateTime;

public class TestCinemaHall {

    public static void main(String[] args) {
        CinemaHall cinemaHall1 = new CinemaHall(1);

        LocalDateTime startDateTime = LocalDateTime.of(2023, 12, 20, 20, 5);
        LocalDateTime endDateTime = LocalDateTime.of(2023, 12, 20, 22, 10);

        Movie movie = new Movie("Batman", startDateTime, endDateTime, 200);

        try {
            cinemaHall1.addMovie(movie);
            cinemaHall1.bookTicket("batman", 50);
        } catch (ScheduleConflictException scheduleConflictException) {
            System.out.println("Error, Schedule conflict. Movie:" + movie.getTitle());
            System.exit(1);
        } catch (SoldOutException soldOutException) {
            System.out.println("SOLD OUT");
        }
    }
}

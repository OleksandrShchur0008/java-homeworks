package de.ait.softwareCinema2;

import de.ait.softwareCinema2.Exceptions.ScheduleConflictException;
import de.ait.softwareCinema2.Exceptions.SoldOutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CinemaHall {

    private int hallNumber;

    private List<Movie> moviesSchedule;

    private static final Logger LOGGER = LoggerFactory.getLogger(CinemaHall.class);

    public CinemaHall(int hallNumber) {
        this.hallNumber = hallNumber;
        this.moviesSchedule = new ArrayList<>();
    }

    public void addMovie(Movie movie) throws ScheduleConflictException {
        if (moviesSchedule.contains(movie)) {
            LOGGER.error("This movie already exists!");
        } else if (isScheduleConflict(movie.getStartTime(), movie.getEndTime())) {
            LOGGER.info("Movie {} was added to the Movie List", movie.getTitle());
            moviesSchedule.add(movie);
        } else {
            LOGGER.error("Movie at this time already scheduled!");
            throw new ScheduleConflictException("Movie at this time already scheduled!");
        }
    }

    public boolean isScheduleConflict(LocalDateTime newMovieStart, LocalDateTime newMovieEnd) {
        boolean result = true;
        for (Movie movieInList : moviesSchedule) {
            if (newMovieStart.isBefore(movieInList.getEndTime()) &&
                    newMovieEnd.isAfter(movieInList.getStartTime())) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public void bookTicket(String title, int tickets) throws SoldOutException {
        for (Movie movie : moviesSchedule) {
            if(title.equalsIgnoreCase(movie.getTitle())) {
                if (movie.getAvailableTickets() >= tickets) {
                    movie.setAvailableTickets(movie.getAvailableTickets() - tickets);
                    LOGGER.info("Movie: {}. Available tickets {}.",movie.getTitle(),movie.getAvailableTickets());
                } else {
                    throw new SoldOutException("Not enough tickets. Available :" + movie.getAvailableTickets() + ". Tickets: " + tickets );
                }
            }
        }
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public List<Movie> getMoviesSchedule() {
        return moviesSchedule;
    }

    public void setMoviesSchedule(List<Movie> moviesSchedule) {
        this.moviesSchedule = moviesSchedule;
    }
}

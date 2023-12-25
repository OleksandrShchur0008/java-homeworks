package de.ait.softwareCinema;

import java.util.List;

public class Cinema implements TicketOperation {

    private List<Film> filmsOnShow;

    public Cinema(List<Film> filmsOnShow) {
        this.filmsOnShow = filmsOnShow;
    }
    protected void addFilm (Film film) {
        filmsOnShow.add(film);
    }

    protected void removeFilm (Film film) {
        filmsOnShow.remove(film);
    }

    protected void showFilmInfo (Film film) {
        System.out.println("Film Trailer screening \"" + film.getTitle() + "\"."
        + "\nDuration of Film: " + film.getDurationInMin() + "\nRating: " + film.getRating()
                + "\nGenre: " + film.getGenre() + "\nAvailable Tickets: " + film.getAvailableTickets());
    }

    @Override
    public int buyTicket(Film film) {
        if (film.getAvailableTickets() > 0) {
            film.removeAvailableTicket();
            System.out.println(film.getAvailableTickets());
        } else {
            System.out.println("error");;
        }
        return 0;
    }

    @Override
    public void returnTicket(Film film) {
        film.addAvailableTicket();
        System.out.println(film.getAvailableTickets());
    }

    @Override
    public int getAvailableTickets(Film film) {
        return film.getAvailableTickets();
    }

}

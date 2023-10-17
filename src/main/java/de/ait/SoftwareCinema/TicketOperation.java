package de.ait.SoftwareCinema;

public interface TicketOperation {

    int buyTicket(Film film);
    void returnTicket(Film film);
    int getAvailableTickets(Film film);

}

package de.ait.SoftwareCinema;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TestCinema {
    public static void main(String[] args) {
        Film filmTransformers1 = new FeatureFilm("Transformers 1", 144, 9.8, "Action/Science Fiction", "Michael Bay", List.of("Shaya Labaf", "Megan Fox", "Josh Demel"), 30 );
        Film filmTransformers4 = new FeatureFilm("Transformers 4 : Age of Extinction", 165,9.5,"Action/Science Fiction", "Michael Bay",List.of("Mark Wahlberg", "Nikola Peitz", "Jack Rainer"), 24);

        filmTransformers1.showTrailer();
        System.out.println("---------------");
        filmTransformers4.showTrailer();
        System.out.println("---------------");

        Film cartoonDemonSlayer = new Cartoon("Demon slayer: Mugen Train", 117, 9.6, "Action/Adventure", "3D",55 );
        cartoonDemonSlayer.showTrailer();
        System.out.println("---------------");

        List<Film> filmsOnShow = new ArrayList<>();
        Cinema cinema = new Cinema(filmsOnShow);
        cinema.addFilm(filmTransformers1);
        cinema.addFilm(filmTransformers4);
        cinema.addFilm(cartoonDemonSlayer);

        cinema.showFilmInfo(filmTransformers1);
        System.out.println("---------------");
        cinema.showFilmInfo(filmTransformers4);
        System.out.println("---------------");
        cinema.showFilmInfo(cartoonDemonSlayer);
        System.out.println("---------------");

        System.out.println(filmTransformers4.getAvailableTickets());
        cinema.buyTicket(filmTransformers4);
        System.out.println("---------------");
        System.out.println(cartoonDemonSlayer.getAvailableTickets());
        cinema.buyTicket(cartoonDemonSlayer);
        System.out.println("---------------");
        System.out.println(filmTransformers4.getAvailableTickets());
        cinema.returnTicket(filmTransformers4);
        System.out.println(UUID.randomUUID().toString());
    }
}

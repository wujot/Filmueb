package main;

import templates.Actor;
import templates.Movie;
import templates.Series;

public class Filmueb {

    public static void main(String[] args) {

        /* App version 0.1
        create objects from each template
        print it at the end*/

        Movie movie1 = new Movie("Pitbull. Nowe Porzadki.", "Patryk Vega", 2016,
                "Drama", "Policemen of two Warsaw commands join forces in the fight against the " +
                "Mokotowska Group.", 7.3);

        Series series1 = new Series("Wataha", 2, 12, "Bogumil Lipski", "Thriller",
                "Captain Wiktor Rebrow is trying to unravel the mystery of the bombing in which his " +
                        "friends from the Border Guard in Bieszczady died.", 7.9);

        Actor actor1 = new Actor("Boguslaw", "Linda", "Poland");

        print(movie1);
        print(series1);
        print(actor1);
    }

    public static void print(Movie movie){
        System.out.println("Movie: ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("Title: %s\nDirector: %s\nYear of production: %d\nType: %s\nDescription: %s\nRating: %.1f\n",
                movie.getTitle(), movie.getDirector(), movie.getProductionYear(), movie.getType(),
                movie.getDescription(), movie.getRating());
        System.out.println("");
    }

    public static void print(Series series){
        System.out.println("Series: ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("Title: %s\nSeries: %d\nEpisods: %d\nProducer: %s\nType: %s\nDescription: %s\nRating: %.1f\n",
                series.getTitle(), series.getSeries(), series.getEpisodes(), series.getProducer(), series.getType(),
                series.getDescription(), series.getRating());
        System.out.println("");
    }

    public static void print(Actor actor){
        System.out.println("Actor: ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("First name: %s\nLast name: %s\nCountry: %s\n", actor.getFirstName(), actor.getSecondName(),
                actor.getCountry());
        System.out.println("");

    }
}

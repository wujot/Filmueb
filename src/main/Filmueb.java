package main;

import templates.Actor;
import templates.ConsoleDataReader;
import templates.Movie;
import templates.Series;

import java.util.Scanner;

public class Filmueb {

    public static void main(String[] args) {

        // App version 0.2

        Scanner sc = new Scanner(System.in);

        ConsoleDataReader console = new ConsoleDataReader();

        // create movie
        Movie movie = console.createMovie(sc);

        // create tv series
        Series tvSeries = console.createTvSeries(sc);

        // create actor
        Actor actor = console.createActor(sc);

        sc.close();

        // print each object
        print(movie);
        print(tvSeries);
        print(actor);
    }

    // printing methods

    public static void print(Movie movie){
        if(movie == null){
            System.out.println("Could not create a movie object.");
        }else {
            System.out.println("Movie: ");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.printf("Title: %s\nDirector: %s\nYear of production: %d\nType: %s\nDescription: %s\nRating: %.1f\n",
                    movie.getTitle(), movie.getDirector(), movie.getProductionYear(), movie.getType(),
                    movie.getDescription(), movie.getRating());
        }
        System.out.println("");
    }

    public static void print(Series series){
        if(series == null) {
            System.out.println("Could not create a tv series object.");
        }else {
            System.out.println("Series: ");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.printf("Title: %s\nSeries: %d\nEpisods: %d\nProducer: %s\nType: %s\nDescription: %s\nRating: %.1f\n",
                    series.getTitle(), series.getSeries(), series.getEpisodes(), series.getProducer(), series.getType(),
                    series.getDescription(), series.getRating());
        }
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

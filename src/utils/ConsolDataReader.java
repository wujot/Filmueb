package utils;

import java.util.Scanner;
import data.Movie;
import data.TvSeries;
import data.Actor;

public class ConsolDataReader {
    private Scanner sc;

    public ConsolDataReader() {
        sc = new Scanner(System.in);
    }

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Movie createMovie() {
        System.out.println("Give a movie details: ");
        System.out.println("Title: ");
        String title = sc.nextLine();
        System.out.println("Director: ");
        String director = sc.nextLine();
        System.out.println("Year of production: ");
        int productionYear = Integer.parseInt(sc.nextLine());
        System.out.println("Type: ");
        String type = sc.nextLine();
        System.out.println("Description: ");
        String description = sc.nextLine();
        System.out.println("Rating: ");
        double rating = Double.parseDouble(sc.nextLine());

        if(productionYear < 0 || (rating < 0 && rating > 10)) {
            return null;
        }else
            return new Movie(title, director, productionYear, type, description, rating);
    }

    public TvSeries createTvSeries() {
        System.out.println("Give a Tv servies details: ");
        System.out.println("Title: ");
        String title = sc.nextLine();
        System.out.println("Number of series: ");
        int series = Integer.parseInt(sc.nextLine());
        System.out.println("Number of episodes: ");
        int episodes = Integer.parseInt(sc.nextLine());
        System.out.println("Producer: ");
        String producer = sc.nextLine();
        System.out.println("Type: ");
        String type = sc.nextLine();
        System.out.println("Description: ");
        String description = sc.nextLine();
        System.out.println("Rating: ");
        double rating = Double.parseDouble(sc.nextLine());

        if (series < 0 || episodes < 0 || (rating < 0 && rating > 10)) {
            return null;
        }else
            return new TvSeries(title, series, episodes, producer, type, description, rating);
    }

    public Actor createActor() {
        System.out.println("Give an Actor details: ");
        System.out.println("First name: ");
        String firstName = sc.nextLine();
        System.out.println("Last name: ");
        String lastName = sc.nextLine();
        System.out.println("Country: ");
        String country = sc.nextLine();
        return new Actor(firstName, lastName, country);
    }
}
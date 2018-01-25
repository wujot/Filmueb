package templates;

import java.util.Scanner;

public class ConsoleDataReader {

    public Movie createMovie(Scanner movie) {
        System.out.println("Give a movie details: ");
        System.out.println("Title: ");
        String title = movie.nextLine();
        System.out.println("Director: ");
        String director = movie.nextLine();
        System.out.println("Year of production: ");
        int productionYear = Integer.parseInt(movie.nextLine());
        System.out.println("Type: ");
        String type = movie.nextLine();
        System.out.println("Description: ");
        String description = movie.nextLine();
        System.out.println("Rating: ");
        double rating = Double.parseDouble(movie.nextLine());

        if(productionYear < 0 || (rating < 0 && rating > 10)) {
            return null;
        }else
            return new Movie(title, director, productionYear, type, description, rating);
    }

    public Series createTvSeries(Scanner tvSeries) {
        System.out.println("Give a Tv servies details: ");
        System.out.println("Title: ");
        String title = tvSeries.nextLine();
        System.out.println("Number of series: ");
        int series = Integer.parseInt(tvSeries.nextLine());
        System.out.println("Number of episodes: ");
        int episodes = Integer.parseInt(tvSeries.nextLine());
        System.out.println("Producer: ");
        String producer = tvSeries.nextLine();
        System.out.println("Type: ");
        String type = tvSeries.nextLine();
        System.out.println("Description: ");
        String description = tvSeries.nextLine();
        System.out.println("Rating: ");
        double rating = Double.parseDouble(tvSeries.nextLine());

        if (series < 0 || episodes < 0 || (rating < 0 && rating > 10)) {
            return null;
        }else
            return new Series(title, series, episodes, producer, type, description, rating);
    }

    public Actor createActor(Scanner actor) {
        System.out.println("Give an Actor details: ");
        System.out.println("First name: ");
        String firstName = actor.nextLine();
        System.out.println("Last name: ");
        String lastName = actor.nextLine();
        System.out.println("Country: ");
        String country = actor.nextLine();
        return new Actor(firstName, lastName, country);
    }
}

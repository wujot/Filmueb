package main;

import templates.Actor;
import templates.ConsoleDataReader;
import templates.Movie;
import templates.Series;

import java.util.Scanner;

public class Filmueb {

    public static void main(String[] args) {

        // App version 0.3

        // create objects of movies, series and actress
        Movie movie = new Movie();
        Series series = new Series();
        Actor actor = new Actor();

        // create arrays of movies, series and actress
        Movie[] arrayOfMovies = new Movie[10];
        Series[] arrayOfSeries = new Series[10];
        Actor[] arrayOfActors = new Actor[10];

        Scanner sc = new Scanner(System.in);

        ConsoleDataReader console = new ConsoleDataReader();

        int choice = menu();

        // menu loop to control the app
        while (choice != 0) {
            switch (choice) {
                case 1:
                    add(arrayOfMovies, console.createMovie(sc));
                    break;
                case 2:
                    add(arrayOfSeries, console.createTvSeries(sc));
                    break;
                case 3:
                    add(arrayOfActors, console.createActor(sc));
                    break;
                case 4:
                    print(arrayOfMovies);
                    print(arrayOfSeries);
                    print(arrayOfActors);
                    break;
            }
            choice = menu();
        }
        System.out.println("     ****************************************");
        System.out.println("You quit from the Filmueb app.\n" +
                "Hope to see you soon.");



    }

    // menu method for the app
    public static int menu(){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *          MENU OF FILMUEB APP         *");
        System.out.println("     ****************************************");
        System.out.println("     1. Add movie");
        System.out.println("     2. Add series");
        System.out.println("     3. Add actor");
        System.out.println("     4. Show all information's");
        System.out.println("     0. Quit");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        return choice;
    }

    // add methods
    public static void add(Movie[] arrayOfMovies, Movie movie) {
        for (int i = 0; i < arrayOfMovies.length; i++) {
            if (arrayOfMovies[i] == null){
                arrayOfMovies[i] = movie;
                break;
            }
        }
    }

    public static void add(Series[] arrayOfSeries, Series tvSeries) {
        for (int i = 0; i < arrayOfSeries.length; i++) {
            if (arrayOfSeries[i] == null){
                arrayOfSeries[i] = tvSeries;
                break;
            }
        }
    }

    public static void add(Actor[] arrayOfActors, Actor actor) {
        for (int i = 0; i < arrayOfActors.length; i++) {
            if (arrayOfActors[i] == null){
                arrayOfActors[i] = actor;
                break;
            }
        }
    }

    // printing methods
    public static void print(Movie[] arrayOfMovies) {
        for (int i = 0; i < arrayOfMovies.length; i++) {
            if (arrayOfMovies[i] != null) {
                System.out.println(arrayOfMovies[i].toString());
            }
        }
    }

    public static void print(Series[] arrayOfSeries) {
        for (int i = 0; i < arrayOfSeries.length; i++) {
            if (arrayOfSeries[i] != null) {
                System.out.println(arrayOfSeries[i].toString());
            }
        }
    }

    public static void print(Actor[] arrayOfActors) {
        for (int i = 0; i < arrayOfActors.length; i++) {
            if (arrayOfActors[i] != null) {
                System.out.println(arrayOfActors[i].toString());
            }
        }
    }
}

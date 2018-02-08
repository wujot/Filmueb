package app;

import data.ApplicationDatabase;
import data.Movie;
import data.TvSeries;
import data.Actor;
import utils.ConsolDataReader;

public class ApplicationController {

    // variables to control app
    public final int exit = 0;
    public final int addMovie = 1;
    public final int addTvSeries = 2;
    public final int addActor = 3;
    public final int printDatabase = 4;

    // variable to communicate with user
    private ConsolDataReader consoleDataReader;

    // database to holds all records
    private ApplicationDatabase applicationDatabase;

    public ApplicationController() {
        consoleDataReader = new ConsolDataReader();
        applicationDatabase = new ApplicationDatabase();
    }

    /*
     * Main loop of the app to control flow of the program
     */
    public void mainLoop() {
        int option;
        printOptions();
        while ((option = consoleDataReader.getInt()) != exit) {
            switch (option) {
                case addMovie:
                    addMovie();
                    break;
                case addTvSeries:
                    addTvSeries();
                    break;
                case addActor:
                    addActor();
                    break;
                case printDatabase:
                    printDatabase();
                    break;
                default:
                    System.out.println("Wrong choice. Let's try again: ");
            }
            printOptions();
        }
        System.out.println("You quit from the app. Hope to see you soon.");
        // close input
        consoleDataReader.close();
    }

    private void printOptions() {
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *          MENU OF FILMUEB APP         *");
        System.out.println("     ****************************************");
        System.out.println("     1. Add movie");
        System.out.println("     2. Add series");
        System.out.println("     3. Add actor");
        System.out.println("     4. Show all records");
        System.out.println("     0. Quit");
        System.out.println();
    }

    private void addMovie() {
        Movie movie = consoleDataReader.createMovie();
        applicationDatabase.addRecord(movie);
    }

    private void addTvSeries() {
        TvSeries tvSeries = consoleDataReader.createTvSeries();
        applicationDatabase.addRecord(tvSeries);
    }

    private void addActor() {
        Actor actor = consoleDataReader.createActor();
        applicationDatabase.addRecord(actor);
    }

    private void printDatabase() {
        applicationDatabase.printMovies();
        applicationDatabase.printTvSeries();
        applicationDatabase.printActor();
    }
}

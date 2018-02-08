package data;

public class ApplicationDatabase {

    public final int maxRecords = 1000;
    private Movie[] movies;
    private TvSeries[] series;
    private Actor[] actors;
    private int moviesNumber;
    private int seriesNumber;
    private int actorsNumber;

    public ApplicationDatabase() {
        movies = new Movie[maxRecords];
        series = new TvSeries[maxRecords];
        actors = new Actor[maxRecords];
    }

    public int getMoviesNumber() {
        return moviesNumber;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public int getActorsNumber() {
        return actorsNumber;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public TvSeries[] getSeries() {
        return series;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void addRecord(Movie movie) {
        if (moviesNumber < maxRecords) {
            movies[moviesNumber] = movie;
            moviesNumber++;
        } else {
            System.out.println("The maximum number of records is reached.");
        }
    }

    public void addRecord(TvSeries tvSeries) {
        if (seriesNumber < maxRecords) {
            series[seriesNumber] = tvSeries;
            seriesNumber++;
        } else {
            System.out.println("The maximum number of records is reached.");
        }
    }

    public void addRecord(Actor actor) {
        if (actorsNumber < maxRecords) {
            actors[actorsNumber] = actor;
            actorsNumber++;
        } else {
            System.out.println("The maximum number of records is reached.");
        }
    }

    public void printMovies() {
        if(moviesNumber == 0) {
            System.out.println("There is no records in database.");
        }
        for(int i=0; i<moviesNumber; i++) {
            System.out.println(movies[i].toString());
        }
    }

    public void printTvSeries() {
        if(seriesNumber == 0) {
            System.out.println("There is no records in database.");
        }
        for(int i=0; i<seriesNumber; i++) {
            System.out.println(series[i].toString());
        }
    }

    public void printActor() {
        if(actorsNumber == 0) {
            System.out.println("There is no records in database.");
        }
        for(int i=0; i<actorsNumber; i++) {
            System.out.println(actors[i].toString());
        }
    }
}

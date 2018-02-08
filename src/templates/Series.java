package templates;

public class Series {
    private String title;
    private int series;
    private int episodes;
    private String producer;
    private String type;
    private String description;
    private double rating;

    public Series() {

    }

    public Series(String title, int series, int episodes, String producer, String type, String description, double rating) {
        this.title = title;
        this.series = series;
        this.episodes = episodes;
        this.producer = producer;
        this.type = type;
        this.description = description;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Series:\n" +
                "---------------------------------------------------------\n" +
                "Title: " + title + "\n" +
                "Series: " + series + "\n" +
                "Episodes: " + episodes + "\n" +
                "Producer: " + producer + "\n" +
                "Type: " + type + "\n" +
                "Description: " + description + "\n" +
                "Rating: " + rating + "\n" +
                "---------------------------------------------------------\n";
    }
}

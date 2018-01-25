package templates;

public class Movie {
    private String title;
    private String director;
    private int productionYear;
    private String type;
    private String description;
    private double rating;

    public Movie() {

    }

    public Movie(String title, String director, int productionYear, String type, String description, double rating) {
        this.title = title;
        this.director = director;
        this.productionYear = productionYear;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
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
}

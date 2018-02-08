package data;

public class Actor {
    private String firstName;
    private String secondName;
    private String country;

    public Actor() {

    }

    public Actor(String firstName, String secondName, String country) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Actor: " + "\n" +
                "---------------------------------------------------------\n" +
                "First name: " + firstName + "\n" +
                "Second name: " + secondName + "\n" +
                "Country: " + country + "\n" +
                "---------------------------------------------------------\n";
    }
}

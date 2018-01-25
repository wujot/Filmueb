package templates;

public class Actor {
    String firstName;
    String secondName;
    String country;

    Actor() {

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
}

package models;

public class Person {

    private String name;
    private Double ageInSeconds;

    public Person(String name, Double ageInSeconds) {
        this.name = name;
        this.ageInSeconds = ageInSeconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(Double ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }
}

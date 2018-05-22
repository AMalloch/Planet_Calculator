package models;

public class Person {

    private String name;
    private Integer ageInSeconds;

    public Person(String name, Integer ageInSeconds) {
        this.name = name;
        this.ageInSeconds = ageInSeconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(Integer ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }
}

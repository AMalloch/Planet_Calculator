package models;

public class Person {

    private String name;
    private Integer daysSpentOnPlanet;

    public Person(String name, Integer daysSpentOnPlanet) {
        this.name = name;
        this.daysSpentOnPlanet = daysSpentOnPlanet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDaysSpentOnPlanet() {
        return daysSpentOnPlanet;
    }

    public void setDaysSpentOnPlanet(Integer daysSpentOnPlanet) {
        this.daysSpentOnPlanet = daysSpentOnPlanet;
    }
}

package models;

public class Planet {

    private String name;
    private Double orbitInDays;

    public Planet(String name, Double orbitInDays) {
        this.name = name;
        this.orbitInDays = orbitInDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOrbitInDays() {
        return orbitInDays;
    }

    public void setOrbitInDays(Double orbitInDays) {
        this.orbitInDays = orbitInDays;
    }
}
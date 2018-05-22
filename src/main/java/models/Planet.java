package models;

public class Planet {

    private String name;
    private Double orbitInYears;

    public Planet(String name, Double orbitInYears) {
        this.name = name;
        this.orbitInYears = orbitInYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOrbitInYears() {
        return orbitInYears;
    }

    public void setOrbitInYears(Double orbitInYears) {
        this.orbitInYears = orbitInYears;
    }
}
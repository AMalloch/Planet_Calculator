package models;

import java.util.ArrayList;

public class Calculator {

    private String calculatorName;
    private Person person;
    private Planet planet;

    public Calculator(String calculatorName, Person person, Planet planet) {
        this.calculatorName = calculatorName;
        this.person = person;
        this.planet = planet;
    }

    public String getCalculatorName() {
        return calculatorName;
    }

    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    // convert orbit in years to seconds rounded to whole number
    public Double convertOrbitDaysToSeconds(Planet planet){
        Double orbitInSeconds = (planet.getOrbitInYears() * 365) * 86400;
        return Math.rint(orbitInSeconds);
    };

    // calculate age based on age in seconds time on planet/orbit in seconds
    // age is rounded down
    public Double calculateAge(Person person, Planet planet){
        Double age = person.getAgeInSeconds() / convertOrbitDaysToSeconds(planet);
        return Math.floor(age);
    };

}

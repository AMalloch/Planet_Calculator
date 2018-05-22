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

    // convert orbit in days to seconds rounded to two decimal places
    public Double convertOrbitDaysToSeconds(Planet planet){
        Double days = planet.getOrbitInDays();
         Double orbitInSeconds = days * 86400.00;
        return orbitInSeconds;
    };

    // convert orbit in days to seconds rounded to two decimal places
    public Double convertPersonOrbitDaysToSeconds(Person person){
        Integer daysOnPlanet = person.getDaysSpentOnPlanet();
         Double personOrbitInSeconds = daysOnPlanet * 86400.00;
        return personOrbitInSeconds;
    };

    // calculate age based on time on planet/orbit in seconds
    public Double calculateAge(Person person, Planet planet){
        Double age = convertPersonOrbitDaysToSeconds(person) / convertOrbitDaysToSeconds(planet);
        return Math.rint(age);
    };

}

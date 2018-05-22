import org.junit.Before;
import org.junit.Test;
import models.*;
import models.Person;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Person person;
    private Planet planet;
    private Calculator calculator;

//    Mercury: Orbital period 0.2408467 Earth years
//    Venus: Orbital period 0.61519726 Earth years
//    Mars: Orbital period 1.8808158 Earth years
//    Jupiter: Orbital period 11.862615 Earth years
//    Saturn: Orbital period 29.447498 Earth years
//    Uranus: Orbital period 84.016846 Earth years
//    Neptune: Orbital period 164.79132 Earth years
//    And, depending on your feelings towards Pluto...
//    Pluto: Orbital period 248.00 Earth years

    @Before
    public void setUp() {
        person = new Person( "Angus", 710);
        planet = new Planet( "Mercury", 87.97);
        calculator = new Calculator("Space Age Calculator", person, planet);
    }

    @Test
    public void ChangeOrbitToSeconds() {
        assertEquals(7600608, calculator.convertOrbitDaysToSeconds(planet), 0.01);
    }

    @Test
    public void ChangePersonOrbitToSeconds() {
        assertEquals(61344000, calculator.convertPersonOrbitDaysToSeconds(person), 0.01);
    }

    @Test
    public void CalculateAge() {
        calculator.convertPersonOrbitDaysToSeconds(person);
        calculator.convertOrbitDaysToSeconds(planet);
        assertEquals(8, calculator.calculateAge(person, planet), 0.01);
    }
}

import org.junit.Before;
import org.junit.Test;
import models.*;
import models.Person;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Person person;
    private Planet mercury;
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
        person = new Person( "Angus", 1000000000);
        mercury = new Planet( "Mercury", 0.2408467);
        calculator = new Calculator("Space Age Calculator", person, mercury);
    }

    @Test
    public void ChangeOrbitToSeconds() {
        assertEquals(7595342, calculator.convertOrbitDaysToSeconds(mercury), 0.01);
    }

    @Test
    public void CalculateAge() {
        calculator.convertOrbitDaysToSeconds(mercury);
        assertEquals(131, calculator.calculateAge(person, mercury), 0.01);
    }
}

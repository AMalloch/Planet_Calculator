import org.junit.Before;
import org.junit.Test;
import models.*;
import models.Person;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Person person;
    private Person person2;
    private Planet mercury;
    private Planet mars;
    private Planet pluto;
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
        person = new Person( "Angus", 1000000000.00);
        person2 = new Person( "Ancient", 1000000000000.00);
        mercury = new Planet( "Mercury", 0.2408467);
        mars = new Planet( "Mars", 1.8808158);
        pluto = new Planet( "Pluto", 248.00);
        calculator = new Calculator("Space Age Calculator", person, mercury);
    }

    @Test
    public void ChangeOrbitToSeconds() {
        assertEquals(7595342, calculator.convertOrbitDaysToSeconds(mercury), 0.01);
    }

    @Test
    public void CalculateAgeMercury() {
        calculator.convertOrbitDaysToSeconds(mercury);
        assertEquals(131, calculator.calculateAge(person, mercury), 0.01);
    }

    // 16.85959
    @Test
    public void CalculateAgeMars() {
        calculator.convertOrbitDaysToSeconds(mars);
        assertEquals(16, calculator.calculateAge(person, mars), 0.01);
    }

    @Test
    public void CalculateAgePluto() {
        calculator.convertOrbitDaysToSeconds(pluto);
        assertEquals(0, calculator.calculateAge(person, pluto), 0.01);
    }

    @Test
    public void CalculateAncietAgePluto() {
        calculator.convertOrbitDaysToSeconds(pluto);
        assertEquals(127, calculator.calculateAge(person2, pluto), 0.01);
    }

}

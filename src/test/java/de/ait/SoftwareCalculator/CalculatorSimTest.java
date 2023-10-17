package de.ait.SoftwareCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSimTest {

    private CalculatorSim calculatorSim;

    @BeforeEach
    public void setUp() {
        calculatorSim = new CalculatorSim();
    }

    @Test
    public void testAddTwoPositiveNumbers() {
        assertEquals(5, calculatorSim.add(2, 3));

    }

    @Test
    public void testAddTwoNegativeNumbers() {
        assertEquals(-6, calculatorSim.add(-4, -2));

    }

    @Test
    public void testAddTwoResultZero() {
        assertEquals(0, calculatorSim.add(-4, 4));

    }

    @Test
    public void testDivideByZero() {
        assertEquals(-1, calculatorSim.divide(3, 0));
    }

    @Test
    public void testDivideTwoPositiveNumbers() {
        assertEquals(3, calculatorSim.divide(30, 10));
    }

    @Test
    public void testMultiplyTwoPositiveNumbers() {
        assertEquals(36, calculatorSim.multiply(6, 6));
    }

    @Test
    public void testMultiplyTwoNegativeNumbers() {
        assertEquals(21, calculatorSim.multiply(-7, -3));
    }

    @Test
    public void testMultiplyPositiveAndNegativeNumbers() {
        assertEquals(-35, calculatorSim.multiply(-7, 5));
    }

    @Test
    public void testMultiplyOnZero() {
        assertEquals(0, calculatorSim.multiply(7, 0));
    }

    @Test
    public void testSubTwoPositiveNumbers() {
        assertEquals(0, calculatorSim.sub(5, 5));
    }
}

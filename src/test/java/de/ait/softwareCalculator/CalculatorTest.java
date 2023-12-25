package de.ait.softwareCalculator;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testMakeOperationAddHappyPath() {
        Calculator calculator = new Calculator();
        assertEquals(15,
                calculator.makeOperation(10,5,"add"));
    }

    @Test
    void testMakeOperationSubHappyPath() {
        Calculator calculator = new Calculator();
        assertEquals(5,
                calculator.makeOperation(10,5,"sub"));
    }

    @Test
    void testMakeOperationDivideFail() {
        Calculator calculator = new Calculator();
        assertEquals(-1,
                calculator.makeOperation(10,5,"divide"));
    }

    @Test
    void testAddPrivateSuccess() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Calculator calculator = new Calculator();
        Method privateMethod =
                Calculator.class.getDeclaredMethod("add", int.class, int.class);
        privateMethod.setAccessible(true);
        int result = (int) privateMethod.invoke(calculator, 10,30);
        assertEquals(40,result);
    }
}
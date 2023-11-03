package de.ait.homework40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BarTest {

    private Bar bar;

    @BeforeEach
    public void setUp() {
        bar = new Bar();
    }

    @Test
    void addDrinkHappyPath() {
        Drink drinkCola = new Drink("Coca-cola", "not alcohol", 500);
        assertTrue(bar.addDrink("1", drinkCola));
        assertEquals(1, bar.getBarCollection().size());
    }

    @Test
    void addDrinkError() {
        assertFalse(bar.addDrink("1", null));
    }

    @Test
    void getDrinkHappyPath() {
        Drink drinkCola = new Drink("Coca-cola", "not alcohol", 500);
        assertTrue(bar.addDrink("1", drinkCola));
        assertEquals(drinkCola, bar.getDrink("1"));
    }

    @Test
    void getDrinkError() {
        assertNull(bar.getDrink("2"));
    }

    @Test
    void getBarCollection() {
    }
}
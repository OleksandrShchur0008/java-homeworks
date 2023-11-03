package de.ait.homework40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    @Test
    void getName() {
        Drink drinkCola = new Drink("Coca-cola", "not alcohol", 500);
        assertEquals("Coca-cola", drinkCola.getName());
    }

    @Test
    void getType() {
    }

    @Test
    void getVolume() {
    }

    @Test
    void setVolume() {
    }
}
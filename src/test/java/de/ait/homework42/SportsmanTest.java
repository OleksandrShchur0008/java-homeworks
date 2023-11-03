package de.ait.homework42;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportsmanTest {

    Sportsman sportsman;

    @BeforeEach
    void setUp() {
        sportsman = new Sportsman("Shoni", 17, "Basketball", 3);
    }

    @Test
    void testToString() {
    }

    @Test
    void updateRecordSuccess() {
        assertEquals(5, sportsman.updateRecord(5));
    }

    @Test
    void updateRecordFail() {
        assertEquals(3, sportsman.updateRecord(2));
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getSport() {
    }

    @Test
    void setSport() {
    }

    @Test
    void getRecords() {
    }

    @Test
    void setRecords() {
    }
}
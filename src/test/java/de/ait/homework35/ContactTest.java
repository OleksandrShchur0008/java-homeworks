package de.ait.homework35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    private Contact testContact;

    @BeforeEach
    void setUp() {
        testContact = new Contact("James", "+4915110413923");
    }

    @Test
    void getName() {
        assertEquals("James", testContact.getName());
    }

    @Test
    void setName() {
        testContact.setName("Damian");
        assertEquals("Damian", testContact.getName());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("+4915110413923", testContact.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        testContact.setPhoneNumber("+4915110413900");
        assertEquals("+4915110413900", testContact.getPhoneNumber());
    }
}
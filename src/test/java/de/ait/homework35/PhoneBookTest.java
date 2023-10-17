package de.ait.homework35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    private PhoneBook testPhoneBook;

    @BeforeEach
    void setUp() {
        testPhoneBook = new PhoneBook();
    }

    @Test
    void testAddContactSuccess() {
        Contact contactJames = new Contact("James", "+4915110413923");
        assertTrue(testPhoneBook.addContact(contactJames));
        assertEquals(contactJames, testPhoneBook.findContactByName(contactJames.getName()));
    }

    @Test
    void testAddSameContact() {
        Contact contactJames = new Contact("James", "+4915110413923");
        Contact contactDamian = new Contact("James", "+4915110413900");
        testPhoneBook.addContact(contactJames);
        assertFalse(testPhoneBook.addContact(contactDamian));
    }

    @Test
    void testAddNullContact() {
        assertFalse(testPhoneBook.addContact(null));
    }

    @Test
    void testDeleteExistingContact() {
        Contact contactJames = new Contact("James", "+4915110413923");
        testPhoneBook.addContact(contactJames);
        assertEquals(contactJames, testPhoneBook.findContactByName(contactJames.getName()));
        assertTrue(testPhoneBook.deleteContact(contactJames.getName()));
        assertNull(testPhoneBook.findContactByName(contactJames.getName()));
    }

    @Test
    void testDeleteNoneExistingContact() {
        assertFalse(testPhoneBook.deleteContact("Giannis"));
    }

    @Test
    void testFindExistingContact() {
        Contact contactJames = new Contact("James", "+4915110413923");
        testPhoneBook.addContact(contactJames);
        assertEquals(contactJames, testPhoneBook.findContactByName(contactJames.getName()));
    }

    @Test
    void testFindNoneExistingContact() {
        assertNull(testPhoneBook.findContactByName("Davis"));
    }
}
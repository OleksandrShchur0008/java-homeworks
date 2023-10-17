package de.ait.homework35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {

    private Book testBook;

    private BookManager bookManager;

    @BeforeEach
    void setUp() {
        bookManager = new BookManager();
        testBook = new Book("N1", "Unit-testing", "Java");
    }

    @DisplayName("Test if book is adding into List")
    @Test
    void testAddBookHappyPath() {
        assertEquals(0, bookManager.getBooks().size());
        bookManager.addBook(testBook);
        assertEquals(1, bookManager.getBooks().size());

        List<Book> resultListBooks = bookManager.getBooks();
        for (Book book : resultListBooks) {
            assertEquals(testBook, book);
        }
    }

    @DisplayName("Test adding the same book into List must throw error")
    @Test
    void testAddBookError() {
        assertEquals(0, bookManager.getBooks().size());
        bookManager.addBook(testBook);
        assertThrows(IllegalArgumentException.class, () -> {bookManager.addBook(testBook);});
    }

    @DisplayName("Test removing book from list")
    @Test
    void testRemoveBookHappyPath() {
        bookManager.addBook(testBook);
        assertTrue(bookManager.removeBook("N1"));
        List<Book> resultListBook = bookManager.getBooks();
        assertEquals(0,resultListBook.size());
    }

    @DisplayName("Test removing book with wrong Isbn from List must throw error")
    @Test
    void testRemoveBookError() {
        bookManager.addBook(testBook);
        assertFalse(bookManager.removeBook("N8"));
        List<Book> resultListBook = bookManager.getBooks();
        assertEquals(1,resultListBook.size());
    }

}
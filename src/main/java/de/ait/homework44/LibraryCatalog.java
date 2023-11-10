package de.ait.homework44;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryCatalog.class);

    private List<Book> books = new ArrayList<>();

    public boolean addBook(Book bookToAdd) {
        if (books.contains(bookToAdd) || bookToAdd == null) {
            LOGGER.error("Book is already in List or null.");
            return false;
        } else {
            books.add(bookToAdd);
            LOGGER.info("Book \"{}\" has been added successfully.", bookToAdd.getTitle());
            return true;
        }
    }

    public boolean removeBook(String bookToRemoveByTitle) {
        for (Book bookToRemove : books) {
            if (bookToRemove.getTitle().equals(bookToRemoveByTitle)) {
                books.remove(bookToRemove);
                LOGGER.info("Book \"{}\" has been removed successfully.", bookToRemove.getTitle());
                return true;
            }
        }
        LOGGER.error("Book not found.");
        return false;
    }


    public Book findBookByTitle(String titleBookToFind) {
        for (Book book : books) {
            if (book.getTitle().equals(titleBookToFind)) {
                LOGGER.info("Book \"{}\" has found successfully.", book.getTitle());
                return book;
            }
        }
        LOGGER.error("Book is not in List.");
        return null;
    }

    public List<Book> listAllBooks() {
        List<Book> copyBooks = new ArrayList<>(books);
        LOGGER.info("List of books has been requested.");
        if(copyBooks.isEmpty()) {
            LOGGER.info("Library is empty.");
        }
        return copyBooks;
    }

}

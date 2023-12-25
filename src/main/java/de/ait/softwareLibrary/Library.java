package de.ait.softwareLibrary;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>(); // все книги
    private ArrayList<Reader> readers = new ArrayList<>(); // все читатели

    public void addBook(Book book) { // добавление книги
        books.add(book);
    }

    public void removeBook(String id) { // удаление книги по ID
        Book bookToRemove = findBookByID(id);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
        } else {
            System.err.println("Book to remove with ID: " + id + " not found.");
        }
    }

    public ArrayList<Book> findBooksByAuthor(String author) { // поиск книг о автору
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book elementBookByAuthor : books) {
            if (elementBookByAuthor.getAuthor().equals(author)) {
                foundBooks.add(elementBookByAuthor);
            }
        }
        return foundBooks;
    }

    public void issueBook(String id, Reader reader) { // выдача книги
        for (Book bookByIssue : books) {
            if (bookByIssue.getId().equals(id)) {
                reader.addBorrowedBook(bookByIssue);
                break;
            }
        }
    }

    public void returnBook(String id, Reader reader) {
        for (Book returnBook : reader.getBorrowedBooks()) {
            if (returnBook.getId().equals(id)) {
                reader.removeBorrowedBook(returnBook);
                break;
            }
        }
    }

    private Book findBookByID(String bookID) {
        for (Book book : books) {
            if (book.getId().equals(bookID)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

}

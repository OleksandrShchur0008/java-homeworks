package de.ait.softwareLibrary;

import java.util.ArrayList;

public class Reader {
    private String name; // Имя читателя
    private ArrayList<Book> borrowedBooks = new ArrayList<>(); // Список взятых книг

    public Reader(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }

    public String getName() {
        return name;
    }
}

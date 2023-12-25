package de.ait.softwareLibrary;

import java.util.ArrayList;
import java.util.List;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        // добавление книг и аудио книг
        library.addBook(new Book("1", "Harry Potter", "Steven King", "Fantasy"));
        library.addBook(new AudioBook("2", "Autumn", "Earth", "Real life", 120));

        // добавление читателей
        Reader reader = new Reader("Me");

        // выдача и возврат книг
        library.issueBook("1", reader);
        library.returnBook("1", reader);

        List<Book> allBooks = library.getBooks();
        for (Book book : allBooks) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle());
        }
        // Поиск книг по автору
        ArrayList<Book> booksByAuthor = library.findBooksByAuthor("Steven King");
        for (Book book : booksByAuthor) {
            System.out.println("Book has found: " + book.getTitle() + ", in genre: " + book.getGenre());
        }
        // Удаление книги
        library.removeBook("2");

        System.out.println("Books after deleting:");
        allBooks = library.getBooks();
        for (Book book : allBooks) {
            System.out.println("-----------------------");
            System.out.println(book.toString());
        }
    }
}

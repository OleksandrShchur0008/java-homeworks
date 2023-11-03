package de.ait.homework44;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {
    Scanner scanner = new Scanner(System.in);
    LibraryCatalog myLibraryCatalog = new LibraryCatalog();

    public void appSystem(){
        System.out.println("Welcome to Library Application!");
        while (true) {
            System.out.println("-----------------------------" +
                    "\nChoose Your Movement:" +
                    "\n1 - Add book to Library. " +
                    "\n2 - Remove book from Library." +
                    "\n3 - Find book by title in Library. " +
                    "\n4 - Show all available books in Library." +
                    "\n5 - Quit from Library." +
                    "\n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter title of book: ");
                    String title = scanner.next();
                    if(title.length() > 39) {
                        System.out.println("Invalid title");
                        break;
                    }
                    System.out.println("Enter author of book: ");
                    String author = scanner.next();
                    if(author.length() > 29) {
                        System.out.println("Invalid author");
                        break;
                    }
                    System.out.println("Enter pages of book: ");
                    int pages = scanner.nextInt();
                    if(pages > 4000) {
                        System.out.println("Invalid page number");
                        break;
                    }
                    System.out.println("Enter year of book: ");
                    int year = scanner.nextInt();
                    if(year > 2024) {
                        System.out.println("Invalid year");
                        break;
                    }
                    Book newBook = new Book(title, author, pages, year);
                    myLibraryCatalog.addBook(newBook);
                    break;
                case 2:
                    System.out.println("Enter title of book to remove it: ");
                    String titleToRemove = scanner.next();
                    myLibraryCatalog.removeBook(titleToRemove);
                    break;
                case 3:
                    System.out.println("Enter title of book to find it: ");
                    String titleToFind = scanner.next();
                    myLibraryCatalog.findBookByTitle(titleToFind);
                    break;
                case 4:
                    List<Book> books = new ArrayList<>(myLibraryCatalog.listAllBooks());
                    for(Book book : books) {
                        System.out.println(book.getTitle() + ", ");
                    }
                    break;
                case 5:
                    System.out.println("Quitting from Library.");
                    return;
                default:
                    System.out.println("Incorrect choice. Try Again.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        LibraryApp myLibraryApp = new LibraryApp();
        myLibraryApp.appSystem();
    }
}

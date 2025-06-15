/*
 * Write a Java program to create a class called "Library" with a collection of
 * books and methods to add and remove books.
 */

import java.util.*;

class Library {
    Books book[] = new Books[100];
    int count = 0;

    public void addBook(Books bookName) { // Add New Book
        book[count++] = bookName;
        System.out.println("Book Added Successfully");
    }

    public void removeBook(String bookID) { // Remove Existing Book
        boolean found = false;
        if (count == 0) {
            System.out.println("No books available");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (book[i].getBookID().equals(bookID)) {
                for (int j = i; j < count - 1; j++) {
                    book[j] = book[j + 1];
                }
                book[--count] = null;
                System.out.println("Book Removed Successfully");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book Not Found");
        }
    }

    public void showAllBook() { // 3. Show All Books
        if (count == 0) {
            System.out.println("No books available");
            return;
        }
        for (int i = 0; i < count; i++) {
            book[i].display();
        }
    }
}

class Books {
    private String bookName;
    private String bookID;

    public Books(String bookName, String bookID) {
        this.bookName = bookName;
        this.bookID = bookID;
    }

    public String getBookID() {
        return bookID;
    }

    public void display() {
        System.out.println("----------------------------");
        System.out.print("Book Name: " + bookName + "\n");
        System.out.print("Book ID: " + bookID + "\n");
        System.out.print("--------------------------------" + "\n");
    }

}

public class Problem55 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Library myLibrary = new Library();
        try {
            while (true) {
                System.out.println("1. Add new book");
                System.out.println("2. Remove existing book");
                System.out.println("3. Show all book");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter Book Name and Book ID: ");
                        String bookName = sc.nextLine();
                        String bookID = sc.nextLine();

                        Books book1 = new Books(bookName, bookID);
                        myLibrary.addBook(book1);
                        break;

                    case 2:
                        System.out.println("Enter the Book ID to remove: ");
                        String removeBookID = sc.nextLine();
                        myLibrary.removeBook(removeBookID);
                        break;

                    case 3:
                        myLibrary.showAllBook();
                        break;

                    case 4:
                        System.out.println("Exiting....Thank you visit again");
                        return;

                    default:
                        System.out.println("Invalid choice");

                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}
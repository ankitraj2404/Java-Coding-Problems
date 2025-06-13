
// Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
import java.util.*;

class Book {
    public String title;
    public String authorName;
    public String isbnNo;

    // Constructor
    public Book(String title, String authorName, String isbnNo) {
        this.title = title;
        this.authorName = authorName;
        this.isbnNo = isbnNo;
    }

    public void displayBook() {
        System.out.println("Title: " + title + "\nAuthor: " + authorName + "\nISBN: " + isbnNo);
    }
}

public class Problem49 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Book myBook[] = new Book[50]; // by default 50
        int count = 0;

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1. Add New Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Show all Book");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Title of the Book: ");
                    String title = sc.nextLine();
                    System.out.println("Enter the Author and ISBN for the book: ");
                    String authorName = sc.nextLine();
                    String isbnNo = sc.nextLine();

                    myBook[count++] = new Book(title, authorName, isbnNo);
                    System.out.println("Book Successfully added");
                    break;

                case 2:
                    System.out.println("Enter title of the book you want to remove: ");
                    String removeTitle = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (myBook[i].title.equalsIgnoreCase(removeTitle)) {
                            for (int j = i; j < count - 1; j++) {

                                myBook[j] = myBook[j + 1];
                            }
                            myBook[--count] = null;
                            found = true;
                            System.out.println("Book removed successfully");
                        }
                    }
                    if (!found) {
                        System.out.println(removeTitle + " is not available........Try with different Title");
                    }
                    break;

                case 3:
                    System.out.println("All Books: ");
                    System.out.println("--------------------------------");
                    for (int i = 0; i < count; i++) {
                        myBook[i].displayBook();
                        System.out.println("--------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

}

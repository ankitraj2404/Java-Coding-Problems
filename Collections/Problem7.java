//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

import java.util.*;

public class Problem7 {
    public static void main(String... args) {
        try (Scanner sc = new Scanner(System.in)) {

            // List of strings
            List<String> fruits = List.of("Apple", "Banana", "Mango", "Guava", "Papaya");

            System.out.print("List of fruits: ");

            fruits.forEach(System.out::println);
            System.out.println();

            System.out.println("What operation do you want to perfrom?(1. To uppercase 2. To lowercase)");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // To store updated result
            List<String> result = new ArrayList<>();

            if (choice == 1) {

                System.out.print("List in uppercase: ");
                fruits.forEach(fruit -> result.add(fruit.toUpperCase()));
                System.out.println();

            } else if (choice == 2) {

                System.out.print("List in lowercase: ");
                fruits.forEach(fruit -> result.add(fruit.toLowerCase()));
                System.out.println();

            } else {

                System.out.println("Invalid choice");
            }

            result.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
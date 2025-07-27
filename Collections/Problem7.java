//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

import java.util.*;

public class Problem7 {
    public static void main(String... args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<String> fruits = List.of("Apple", "Banana", "Mango", "Guava", "Papaya");

            System.out.print("List of fruits: ");

            fruits.forEach(System.out::println);
            System.out.println();
            System.out.println("What operation do you want to perfrom?(1. To uppercase 2. To lowercase)");
            int choice = sc.nextInt();
            List<String> result = new ArrayList<>();
            if (choice == 1) {
                System.out.println("List in uppercase: ");
                fruits.forEach(fruit -> result.add(fruit.toUpperCase()));
            } else if (choice == 2) {
                System.out.println("List in lowercase: ");
                fruits.forEach(fruit -> result.add(fruit.toLowerCase()));
            } else {
                System.out.println("Invalid choice");
            }
            result.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
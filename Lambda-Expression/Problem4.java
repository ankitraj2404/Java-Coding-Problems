//Write a Java program to implement a lambda expression to check if a given string is empty.

import java.util.function.Predicate;

public class Problem4 {

    // Method to check string is empty or not
    public static void checkString(String s, Predicate<String> check) {
        if (check.test(s)) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");
        }
    }

    public static void main(String[] args) {

        String str = "     ";
        String str1 = "Hello";

        Predicate<String> check = value -> value.trim().isEmpty();

        checkString(str, check);
        checkString(str1, check);
    }
}

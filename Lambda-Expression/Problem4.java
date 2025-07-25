//Write a Java program to implement a lambda expression to check if a given string is empty.

import java.util.function.Predicate;

public class Problem4 {
    public static void main(String[] args) {

        String str = new String();
        String str1 = "Hello";

        Predicate<String> check = value -> value.isEmpty();

        Boolean result = check.test(str1);
        Boolean result1 = check.test(str);

        if (result) {
            System.out.println("is empty");
        } else {
            System.out.println("Not Empty");
        }
        if (result1) {
            System.out.println("is empty");
        } else {
            System.out.println("Not Empty");
        }
    }
}

// Write a Java program to manually throw a NullPointerException and catch it using multi-catch statements.

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            throw new NullPointerException("You are trying to access a null defined object");

        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName());
            System.out.println("Error: " + e.getMessage());
        }
    }
}

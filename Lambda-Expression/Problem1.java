//Write a Java program to implement a lambda expression to find the sum of two integers.

import java.util.Scanner;

@FunctionalInterface
interface addOperation {
    public int addition(int a, int b);
}

public class Problem1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();

            addOperation add = (a, b) -> firstNumber + secondNumber;

            int result = add.addition(firstNumber, secondNumber);
            System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is: " + result);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

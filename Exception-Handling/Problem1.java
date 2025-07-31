
// Write a Java program that throws an exception and catch it using a try-catch block.

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers to perform division: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Enter valid denominator " + e);
        }
    }
}

//Write a Java program to implement a lambda expression that adds two integers and then subtracts a third value using function composition.

import java.util.Scanner;
import java.util.function.BiFunction;

@FunctionalInterface
interface TriFunction<A, B, C, R> {
    Integer subtract(A a, B b, C c);
}

public class Problem3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("Enter third number: ");
            int num3 = sc.nextInt();

            BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

            TriFunction<Integer, Integer, Integer, Integer> addthenSubtract = (a, b, c) -> add.apply(a, b) - c;

            int result = addthenSubtract.subtract(num1, num2, num3);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

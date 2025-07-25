//Write a Java program to implement a lambda that adds two integers and then multiplies the result by a constant factor.

import java.util.Scanner;

@FunctionalInterface
interface myinterface {

    public int add(int a, int b, int c);
}

public class Problem2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter two numbers: ");
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();

            System.out.println("Enter a constant value: ");
            int constant = sc.nextInt();

            myinterface obj = (a, b, c) -> (a + b) * c;
            int result = obj.add(firstNumber, secondNumber, constant);

            System.out.println("Result is: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
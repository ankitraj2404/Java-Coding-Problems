//Program to check whether a given number is Odd or Even

import java.util.InputMismatchException;
import java.util.Scanner;

interface oddEvenCheck {

    public boolean check(int a);
}

public class Problem4 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number to check: ");
            int num = sc.nextInt();

            oddEvenCheck isEven = (n) -> (n % 2 == 0) ? true : false;

            if (isEven.check(num)) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }

        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getSimpleName());
        }

    }
}
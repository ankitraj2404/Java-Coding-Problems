//Program to check whether a given number is Odd or Even

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number to check: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            } else {
                System.out.println(num + " is an odd number");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        sc.close();
    }
}
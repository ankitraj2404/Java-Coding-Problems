//Program to reverse a number

import java.util.*;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();

            int temp = num;
            int sum = 0;

            while (num != 0) {
                int rem = num % 10;
                sum = sum * 10 + rem;
                num = num / 10;
            }
            System.out.println("The reverse of " + temp + " is: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid values");
        }
        sc.close();
    }
}
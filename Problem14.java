//Program to display the digits, digits-count and their sum from a number

import java.util.*;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();

            String numString = Integer.toString(Math.abs(num));

            System.out.print("Digits: ");
            int count = 0, sum = 0;
            for (int i = 0; i < numString.length(); i++) {
                int digit = Character.getNumericValue(numString.charAt(i));
                System.out.print(digit + " ");
                count++;
                sum += digit;
            }
            System.err.println();
            System.out.println("The count of the digits in " + num + " is: " + count);
            System.out.println("The sum of the digits are: " + sum);

            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid value");
        }
    }
}
//Program to calculate the sum of the even numbers till the given number

import java.util.*;

public class Problem39 {

    public long addEvens(long num) { // Method to find the sum of the even numbers
        if (num <= 1) {
            return 0;
        }
        if (num % 2 != 0) {
            return addEvens(num - 1);
        } else {
            return num + addEvens(num - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the limit: ");
            long num = sc.nextLong();

            Problem39 obj = new Problem39(); // Create the object of the class
            long sum = obj.addEvens(num); // call the method and store the result
            System.out.println("Sum of even numbers till " + num + " is: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }

}

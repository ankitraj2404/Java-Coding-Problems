//Program to check whether the given number is prime or not

import java.util.*;

public class Problem36 {

    static void checkPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println(num + " is not a prime number");
        } else {
            System.out.println(num + " is a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number to check: ");
            int num = sc.nextInt();
            checkPrime(num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }

}

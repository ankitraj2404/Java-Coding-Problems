//Program to find GCD of two number

import java.util.*;

public class Problem37 {

    static void findGcd(int num1, int num2) {
        int temp1 = num1, temp2 = num2;
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println("GCD of " + temp1 + " and " + temp2 + " is: " + num1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            findGcd(num1, num2);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}

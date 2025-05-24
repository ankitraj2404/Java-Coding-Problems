//Program to find GCD of two number

import java.util.*;

public class Problem37 {

    static int findGcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    static void findLcm(int num1, int num2) {
        int gcd = findGcd(num1, num2);
        int lcm = num1 * num2 / gcd;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers to find LCM and GCD: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int gcd = findGcd(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
            findLcm(num1, num2);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}

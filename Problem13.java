//Program to find the factorial of a number

import java.util.*;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("The factorial of 0 is: 1");
            } else if (num < 0) {
                System.out.println("The factorial of negative numbers are undefined.");
            } else {
                int fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact = fact * i;
                }
                System.out.println("The factorial of " + num + " is: " + fact);
            }
        } catch (Exception e) {
            System.out.println("Enter only valid value");
        }
        sc.close();

    }

}

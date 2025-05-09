//Program to print the Fibonacci series till the given terms

import java.util.*;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of terms: ");
            int terms = sc.nextInt();

            if (terms == 0) {
                System.out.println("Enter a number greater than zero");
            } else {
                int a = 0, b = 1;
                System.out.print("Fibonacci series: ");

                if (terms == 1) {
                    System.out.print(a);
                } else {
                    System.out.print(a + " , " + b);
                    for (int i = 2; i < terms; i++) {
                        int c = a + b;
                        System.out.print(" , " + c);
                        a = b;
                        b = c;
                    }
                }
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter valid values");

        }
    }
}
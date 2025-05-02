//Program to find the roots of the quadratic equation

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficient value(a,b,c): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double D = (Math.pow(b, 2) - 4 * a * c);

        if (D == 0) {
            System.out.println("The quadratic equation will have real and equal roots");
            double equalRoot = (-b - Math.sqrt(D)) / 2.0 * a;
            System.out.println("The root is: " + equalRoot);
        } else if (D > 0) {
            System.out.println("The quadratic equation will have real roots");
            double root1 = (-b - Math.sqrt(D)) / 2.0 * a;
            double root2 = (-b + Math.sqrt(D)) / 2.0 * a;
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            System.out.println("The quadratic equation will have imaginary roots");
            double realPart = -b / 2.0 * a;
            double imaginaryPart = Math.sqrt(-D) / 2.0 * a;
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 1: " + realPart + " - " + imaginaryPart + "i");
        }
        sc.close();
    }
}
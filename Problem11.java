/*  Problem:-- Ron wishes to renovate his barn. He thinks that creating fences and keeping the animals separate will help him feed the animals more easily and prevent them from getting mixed.
For this, he plans to divide the area into three parts. He wishes to have a square area for the chickens, a circular area for the ducks, and a rectangular area for the cows.
Write a program to help Ron calculate the area of each fence. */

import java.util.*;

public class Problem11 {

    public double calculateAreaOfSquare(double side) {

        double areaOfSquare = side * side;
        return areaOfSquare;

    }

    public double calculateAreaOfCircle(double radius) {
        double areaOfCircle = 3.14 * (radius * radius);
        return areaOfCircle;
    }

    public double calculateAreaOfRectangle(double length, double breadth) {
        double areaOfRectangle = length * breadth;
        return areaOfRectangle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem11 obj = new Problem11();

        System.out.println("Enter the side of the square: ");
        double side = sc.nextDouble();

        System.out.println("Enter the radius of the square: ");
        double radius = sc.nextDouble();

        System.out.println("Enter the length and breadth of the circle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        double squareArea = obj.calculateAreaOfSquare(side);
        System.out.println("Square area: " + squareArea);

        double circleArea = obj.calculateAreaOfCircle(radius);
        System.out.println("Circle area: " + circleArea);

        double rectangleArea = obj.calculateAreaOfRectangle(length, breadth);
        System.out.println("Rectangle area: " + rectangleArea);

        sc.close();

    }
}
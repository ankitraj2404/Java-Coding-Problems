/* Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, 
and subclasses for "Rectangle", "Circle", and "Triangle". */

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Shape { // Shape class
    abstract public double area();

    abstract public double perimeter();
}

class Rectangle extends Shape { // Rectangle class
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

}

class Circle extends Shape { // Circle class
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape { // Triangle class
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * (base * height);
    }

    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }
}

public class Problem60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            while (true) {
                System.out.print("---------------------" + "\n");
                System.out.print("1. Rectangle" + "\n");
                System.out.print("2. Circle" + "\n");
                System.out.print("3. Triangle" + "\n");
                System.out.print("4. Exit" + "\n");
                System.out.print("---------------------" + "\n");
                System.out.println("Choose the shape:");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the length and breadth of the rectangle: ");
                        double length = sc.nextDouble();
                        double breadth = sc.nextDouble();

                        Rectangle rec1 = new Rectangle(length, breadth);
                        System.out.print("---------------------" + "\n");
                        System.out.print("Area of rectangle: " + rec1.area() + "\n");
                        System.out.print("Perimeter of rectangle: " + rec1.perimeter() + "\n");
                        System.out.print("---------------------" + "\n");
                        break;

                    case 2:
                        System.out.println("Enter radius of circle: ");
                        double radius = sc.nextDouble();
                        Circle circ1 = new Circle(radius);
                        System.out.print("---------------------" + "\n");
                        System.out.print("Area of circle: " + circ1.area() + "\n");
                        System.out.print("Perimeter of circle: " + circ1.perimeter() + "\n");
                        System.out.print("---------------------" + "\n");
                        break;

                    case 3:
                        System.out.println("Enter base and height of the triangle: ");
                        double base = sc.nextDouble();
                        double height = sc.nextDouble();

                        Triangle triangle1 = new Triangle(base, height);
                        System.out.print("---------------------" + "\n");
                        System.out.print("Area of triangle: " + triangle1.area() + "\n");
                        System.out.print("Perimeter of triangle: " + triangle1.perimeter() + "\n");
                        System.out.print("---------------------" + "\n");
                        break;

                    case 4:
                        System.out.println("Exiting");
                        return;

                    default:
                        System.out.println("Enter valid choice");

                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }

}

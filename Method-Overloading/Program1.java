//Program to find the area of rectangle, circle and cuboid

import java.util.*;

public class Program1 {

    static void findArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of the rectangle is: " + area);
    }

    static void findArea(int length, int width, int height) {
        int area = 2 * (length * width + length * height + height * width);
        System.out.println("Area of the cuboid is: " + area);
    }

    static void findArea(float radius) {
        float area = (float) Math.PI * (radius * radius);
        System.out.printf("Area of the circle is: %.2f\n", area);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the shape for finding area(1 for Rectangle, 2 for Circle, 3 for Cuboid)");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the length and breadth of the rectangle: ");
                    int length = sc.nextInt();
                    int breadth = sc.nextInt();
                    findArea(length, breadth);
                    break;
                case 2:
                    System.out.println("Enter the radius of the circle: ");
                    float radius = sc.nextFloat();
                    findArea(radius);
                    break;
                case 3:
                    System.err.println("Enter the length, width and height of the cuboid: ");
                    int len = sc.nextInt();
                    int width = sc.nextInt();
                    int height = sc.nextInt();
                    findArea(len, width, height);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
        } finally {
            sc.close();
        }
    }
}
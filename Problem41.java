
//Write a program to declare a Rectangle class and create for finding perimeter and area
import java.util.InputMismatchException;
import java.util.Scanner;

class Rectangle { // Rectangle Class
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

public class Problem41 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the length and breadth of the rectangle: ");
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();

            Rectangle rec = new Rectangle(); // Object of the class
            rec.length = length;
            rec.breadth = breadth;

            System.out.println("Area: " + rec.area());
            System.out.println("Perimeter: " + rec.perimeter());
            System.out.println("Is it a square: " + rec.isSquare());

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }

}

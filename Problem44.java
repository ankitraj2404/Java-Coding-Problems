
// Write a Rectangle class for parameterized and Non parameterized constructor
import java.util.*;

class Rectangle {
    private int length;
    private int breadth;

    // Non-Parameterized Constructor
    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterized Constructor
    public Rectangle(int length, int breadth) {
        if (length == breadth)
            sideArea(length);
        else
            this.length = length;
        this.breadth = breadth;
    }

    // Method for Area
    public double getArea() {
        return length * breadth;
    }

    // Method for perimeter
    public double getPerimeter() {
        if (length == breadth) {
            return 2 * (length + length);
        } else {
            return 2 * (length + breadth);
        }
    }

    // if square
    public double sideArea(int length) {
        this.length = length;
        this.breadth = length;

        return length * length;
    }

    public String toString() {
        if (length == breadth) {
            return "Square\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
        } else {
            return "Rectangle\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
        }
    }
}

public class Problem44 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the length and breadth of the rectangle: ");
            int length = sc.nextInt();
            int breadth = sc.nextInt();

            Rectangle myRectangle = new Rectangle(length, breadth);
            System.out.println(myRectangle);

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}

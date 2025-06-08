//Write a class for cylinder having properties as Radius and Height , Methods as lidArea, SurfaceArea, Circumference

import java.util.*;

class Cylinder {
    public int radius;
    public int height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return (2 * lidArea() + circumference() * height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "LidArea: " + lidArea() + "\n" + "Total Surface Area: " + totalSurfaceArea() + "\n" + "Volume: "
                + volume();
    }
}

public class Problem43 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the radius and height of the cylinder: ");
            int radius = sc.nextInt();
            int height = sc.nextInt();

            Cylinder myCylinder = new Cylinder();
            myCylinder.radius = radius;
            myCylinder.height = height;

            System.out.println(myCylinder);

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");

        } finally {
            sc.close();
        }
    }

}

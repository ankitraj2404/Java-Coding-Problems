
//Program to find the Area of the Triangle
import java.util.*;

public class Problem1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Choice (1 for base-height, 2 for 3 sides): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the base and height of the triangle: ");
                float base = sc.nextFloat();
                float height = sc.nextFloat();
                float area = 0.5f * base * height;
                System.out.println(
                        "The area of the triangle with base " + base + " and height " + height + " is: " + area);
                break;

            case 2:
                System.out.println("Enter the three sides of the triangle: ");
                float side_1 = sc.nextFloat();
                float side_2 = sc.nextFloat();
                float side_3 = sc.nextFloat();
                float s = (side_1 + side_2 + side_3) / 2;
                double areaNew = Math.sqrt(s * (s - side_1) * (s - side_2) * (s - side_3));
                System.out.println("The area of the triangle with sides " + side_1 + ", " + side_2 + ", " + side_3
                        + " is: " + areaNew);
                break;

            default:
                System.out.println("Enter the correct choice");
                break;
        }

        sc.close();
    }
}

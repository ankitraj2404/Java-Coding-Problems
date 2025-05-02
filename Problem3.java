
//Program to calculate the area , volume and perimeter of the cuboid
import java.util.Scanner;

public class Problem3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length, breadth and height of the cuboid: ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        float height = sc.nextFloat();

        System.out.println("What do you want to calculate? \n1.Total Area \n2.Volume \n3.Perimeter");
        System.out.print("Enter your choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                double area = 2 * (length * breadth + breadth * height + length * height);
                System.out.println("Total area: " + area);
                break;

            case 2:
                double volume = (length * breadth * height);
                System.out.println("Volume of the cuboid is: " + volume);
                break;

            case 3:
                double perimeter = 4 * (length + breadth + height);
                System.out.println("The perimeter of the cuboid is:" + perimeter);
                break;

            default:
                System.out.println("Enter valid choice");
                break;
        }
        sc.close();

    }

}

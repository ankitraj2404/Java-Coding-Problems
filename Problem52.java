
/* Write a Java program to create class called "TrafficLight" with attributes for color and duration, 
and methods to change the color and check for red or green. */

import java.util.*;

class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public boolean isRed() {
        if (this.color.equalsIgnoreCase("red")) {
            return true;
        } else
            return false;
    }

    public boolean isGreen() {
        if (this.color.equalsIgnoreCase("green")) {
            return true;
        } else
            return false;
    }

    public String toString() {
        return "Signal Color: " + color + "\n"
                + "Duration: " + duration + "\n" +
                "----------------------";

    }
}

public class Problem52 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the signal color: ");
            String color = sc.nextLine();
            System.out.println("Enter the duration: ");
            int duration = sc.nextInt();
            TrafficLight traffic1 = new TrafficLight(color, duration);

            while (true) {
                System.out.println("----------------------");
                System.out.println("1.Check Signal color and Duration");
                System.out.println("2. Set the Signal color");
                System.out.println("3. Check Red");
                System.out.println("4. Check Green");
                System.out.println("5.Exit");
                System.out.println("----------------------");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("----------------------");
                        System.out.println(traffic1);
                        break;
                    case 2:
                        System.out.println("Enter the signal color to change: ");
                        String changeColor = sc.nextLine();
                        traffic1.changeColor(changeColor);
                        break;
                    case 3:
                        if (traffic1.isRed()) {
                            System.out.println("Signal is Red");
                        } else {
                            System.out.println("Signal is Not Red");
                        }
                        break;
                    case 4:
                        if (traffic1.isGreen()) {
                            System.out.println("Signal is Green");
                        } else {
                            System.out.println("Signal is Not Green");
                        }
                        break;
                    case 5:
                        System.out.println("Exiting");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }

    }

}

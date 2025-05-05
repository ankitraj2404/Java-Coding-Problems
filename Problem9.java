//Program to check the week-day with the given number

import java.util.*;

public class Problem9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the day number: ");
            int day = sc.nextInt();
            if (day == 1) {
                System.out.println("Its MONDAY");
            } else if (day == 2) {
                System.out.println("Its TUESDAY");
            } else if (day == 3) {
                System.out.println("Its WEDNESDAY");
            } else if (day == 4) {
                System.out.println("Its THURSDAY");
            } else if (day == 5) {
                System.out.println("Its FRIDAY");
            } else if (day == 6) {
                System.out.println("Its SATURDAY");
            } else if (day == 7) {
                System.out.println("Its SUNDAY");
            } else {
                System.out.println("Not a valid Number");
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter valid weekday number");
        }
        sc.close();
    }

}

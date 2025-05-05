//Program to check whher a given year is leap year or not

import java.util.*;

public class Problem8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the year: ");
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid year in the form of integer");
        }
        sc.close();
    }

}

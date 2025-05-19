//Program to validate the given complete date

import java.util.*;

public class Problem17 {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int date, int month, int year) {
        if (month < 1 || month > 12 || date < 1 || year < 1) {
            return false;
        }

        int daysInMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        return date <= daysInMonth[month - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the date: ");
            int date = sc.nextInt();

            System.out.println("Enter the month: ");
            int month = sc.nextInt();

            System.out.println("Enter the year: ");
            int year = sc.nextInt();

            if (isValidDate(date, month, year)) {
                System.out.println("The date " + date + "/" + month + "/" + year + " is valid.");
            } else {
                System.out.println("The date " + date + "/" + month + "/" + year + " is invalid.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}
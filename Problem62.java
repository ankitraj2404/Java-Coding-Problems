//Write a java Program to check leap year by using lambda expression

import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem62 {

    @FunctionalInterface
    public interface Leap {
        boolean leapYearcheck(int year);
    }

    public static void main(String... args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the year to check: ");
            int year = sc.nextInt();

            Leap lp = (y) -> {
                return ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0));
            };

            System.out.println(lp.leapYearcheck(year));

        } catch (InputMismatchException e) {
            System.out.println("Enter only a valid numeric input!");
        }
    }
}

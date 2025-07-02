//Write a java Program to check leap year by using lambda expression

import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem62 {

    @FunctionalInterface
    public interface Leap {
        String leapYearcheck(int year);
    }

    public static void main(String... args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the year to check: ");
            int year = sc.nextInt();

            Leap lp = (y) -> {
                if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
                    return y + " is a leap year";
                else
                    return y + " is not a leap year";
            };

            System.out.println(lp.leapYearcheck(year));

        } catch (InputMismatchException e) {
            System.out.println("Enter only a valid numeric input!");
        }
    }
}

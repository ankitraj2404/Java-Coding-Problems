
//Write a java Program to print the weekday using enum data type.
import java.util.*;

enum weekDay {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THRUSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int dayNumber;

    weekDay(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public static weekDay fromNumber(int number) {
        for (weekDay day : weekDay.values()) {
            if (day.dayNumber == number) {
                return day;
            }
        }
        return null;
    }
}

public class Problem9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter day number from(1 to 7): ");
            int input = sc.nextInt();

            weekDay day = weekDay.fromNumber(input);
            System.out.println(day);

        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}

//Program to find whether the given number is Armstrong or not
import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter the number to check: ");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Armstrong number can't be negative");
            } else {
                int temp = num, sum = 0, digit;

                while (num != 0) {
                    digit = num % 10;
                    sum = sum + digit * digit * digit;
                    num = num / 10;
                }

                if (sum == temp) {
                    System.out.println(temp + " is an Armstrong number");
                } else {
                    System.out.println(temp + " is not an Armstrong number");
                }
                sc.close();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid integer");
        }
    }

}

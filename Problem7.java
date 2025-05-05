//Program to find radix of the given number in the form of string

import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number: ");
            String num = sc.nextLine();

            if (num.matches("[01]+")) {
                System.out.println("Binary");
            } else if (num.matches("[0-7]+")) {
                System.out.println("Octal number");
            } else if (num.matches("[0-9]+")) {
                System.out.println("Decimal number");
            } else if (num.matches("[0-9a-fA-F]+")) {
                System.out.println("Hexadecimal");
            } else {
                System.out.println("Not a valid format");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid format");
        }
        sc.close();
    }

}

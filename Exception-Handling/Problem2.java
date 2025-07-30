//Write a Java program to intentionally throw a custom exception from a method and catch it in the caller using a try-catch block.

import java.util.Scanner;

class outOfRangeException extends IndexOutOfBoundsException {
    public outOfRangeException(String message) {
        super(message);
    }
}

public class Problem2 {

    public static void printNumbers(int start, int end) throws outOfRangeException {
        if (start < 10 || end > 20) {
            throw new outOfRangeException("Range must be between 10 and 20");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter starting and ending point: ");
            int start = sc.nextInt();
            int end = sc.nextInt();

            printNumbers(start, end);
        } catch (outOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}

//Program to generate fibonacci series using reursive method

import java.util.*;

public class Problem38 {

    public long fibonacci(long num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public void printFibonacciSeries(long number) {
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the range: ");
            long num = sc.nextInt();
            Problem38 obj = new Problem38();
            obj.printFibonacciSeries(num);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}

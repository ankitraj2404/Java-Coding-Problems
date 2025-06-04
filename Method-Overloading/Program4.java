
//Write a method to print the Prime numbers in the array of integers
import java.util.*;

public class Program4 {

    static void findPrime(int[] array) {
        int len = array.length;
        System.out.print("Prime numbers: ");
        for (int i = 0; i < len; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare and Initialize array
            int[] array = new int[size];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            // Display the array
            System.out.print("Array: ");
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
            findPrime(array);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }

}


//Write a Java program to find the average of prime numbers in an integer array.
import java.util.Arrays;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("Original array: " + Arrays.toString(array));
            int primeSum = 0, primeCount = 0;

            for (int i = 0; i < size; i++) {
                int num = array[i];
                if (num > 1) {
                    boolean isPrime = true;
                    for (int j = 2; j <= Math.sqrt(num); j++) {
                        if (num % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        primeSum += num;
                        primeCount++;
                    }
                }
            }
            double average = primeSum / primeCount;
            System.out.println("Average of prime numbers: " + average);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

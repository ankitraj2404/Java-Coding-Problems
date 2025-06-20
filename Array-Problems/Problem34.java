
//Write a Java program to compute the average value of an array of integers except the largest and smallest values.
import java.util.*;

public class Problem34 {

    public static void findAverage(int[] array, int size) {
        int max = array[0], min = array[0];

        for (int i = 1; i < size; i++) {// find min and max
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int sum = 0, count = 0;
        for (int i = 1; i < size; i++) {// find min and max
            if (array[i] != max && array[i] != min) {
                sum += array[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not enough unique elements to compute average.");
            return;
        }
        float average = (float) sum / count;

        System.out.printf("The average of all the elements after excluding min and max element: %.2f\n", average);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            if (size <= 2) {
                System.out.println("Array size should be greater than 2 to exclude min and max.");
                return;
            }

            int[] array = new int[size];

            System.out.println("Enter elements of the array");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + (i + 1) + " : ");
                array[i] = sc.nextInt();
            }

            findAverage(array, size);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}

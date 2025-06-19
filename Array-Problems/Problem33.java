import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem33 {
    public static int differenceMaxMin(int[] array, int size) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            if (size <= 0) {
                System.out.println("Array size should be greater than 0.");
                return;
            }

            int[] array = new int[size];

            System.out.println("Enter elements of the array");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at " + (i + 1) + " : ");
                array[i] = sc.nextInt();
                // System.out.println();
            }
            int difference = differenceMaxMin(array, size);
            System.out.println("The difference between max and min value is: " + difference);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }

    }
}

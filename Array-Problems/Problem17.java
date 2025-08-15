
//Write a Java program to check if an array contains all elements of another array.
import java.util.Arrays;
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println("Enter elements of the first array: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("First array: " + Arrays.toString(array));

            int[] array2 = new int[size];
            System.out.println("Enter elements of the second array: ");
            for (int i = 0; i < size; i++) {
                array2[i] = sc.nextInt();
            }
            System.out.println("Second array: " + Arrays.toString(array2));

            array = Arrays.stream(array)
                    .sorted()
                    .toArray();

            array2 = Arrays.stream(array2)
                    .sorted()
                    .toArray();

            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (array[i] == array2[i]) {
                    found = true;
                    continue;
                } else {
                    found = false;
                    System.out.println("Elements are different");
                    break;
                }
            }
            if (found) {
                System.out.println("Elements are same");
            }

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

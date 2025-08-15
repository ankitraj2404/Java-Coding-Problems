
//Write a Java program to check if an array contains only unique values.
import java.util.Arrays;
import java.util.Scanner;

public class Problem18 {
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
            boolean duplicateFound = false;

            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] == array[j]) {
                        duplicateFound = true;
                        break;
                    }
                }
            }
            String result = duplicateFound ? "Array doesn't contains unique elements"
                    : "Array contains unique elements";

            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());

        }
    }
}

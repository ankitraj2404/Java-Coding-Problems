import java.util.Arrays;
import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("Original Array: " + Arrays.toString(array));

            int[] copiedArray = Arrays.stream(array).map(i -> i).toArray();
            System.out.println("Copied Array: " + Arrays.toString(copiedArray));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Problem20 {
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
            Arrays.sort(array);
            boolean hasConsecutive = true;

            outerLoop: for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j <= i + 1; j++) {
                    if (array[i] + 1 != array[j]) {
                        hasConsecutive = false;
                        break outerLoop;

                    }
                }
            }

            String result = hasConsecutive ? "Array Contains consecutive elements"
                    : "Array doesn't contains consecutive elements";

            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
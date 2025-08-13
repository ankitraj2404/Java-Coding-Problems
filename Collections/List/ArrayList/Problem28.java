import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem28 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many values do you want to have in list?");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }

            System.out.println("Original list: " + list);

            System.out.println("Enter the element you want to search: ");
            int search = sc.nextInt();

            list.stream()
                    .filter(e -> e == search)
                    .findFirst()
                    .ifPresentOrElse(e -> System.out.println("Element found: " + e),
                            () -> System.out.println("Element not found"));

            int index = IntStream.range(0, size - 1)
                    .filter(i -> list.get(i) == search)
                    .findFirst()
                    .orElse(-1);

            System.out.println(index >= 0 ? "Element " + search + " found at index: " + index : "Element not found");

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

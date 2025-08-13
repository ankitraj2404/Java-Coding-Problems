
//Write a Java program to implement a case-insensitive search for an element in an ArrayList using streams.
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem30 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want to have?");
            int size = sc.nextInt();
            sc.nextLine();

            ArrayList<String> list = new ArrayList<>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextLine());
            }
            System.out.println("Original list: " + list);
            System.out.println("Enter the element you want to search: ");
            String search = sc.nextLine();

            Optional<String> value = IntStream.range(0, size)
                    .filter(i -> list.get(i).equalsIgnoreCase(search))
                    .mapToObj(list::get)
                    .findFirst();

            value.ifPresentOrElse(v -> System.out.println("Element found"),
                    () -> System.out.println("Element not found"));

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}


//Write a Java program to search for a specific string in an ArrayList using binary search after sorting the list.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem29 {
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

            List<String> sortedList = list.stream()
                    .sorted() // in ascending order
                    .collect(Collectors.toList());

            System.out.println("Sorted list: " + sortedList);

            System.out.println("Enter the element to search: ");
            String search = sc.nextLine();

            int left = 0, right = size - 1;
            boolean found = false;
            while (left <= right) {
                int mid = (left + right) / 2;

                if (sortedList.get(mid).equals(search)) {
                    System.out.println("Element found at index: " + mid);
                    found = true;
                    break;
                } else if (sortedList.get(mid).compareTo(search) > 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (!found) {
                System.out.println(search + " is not available in the list.");
            }

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

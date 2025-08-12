
// Write a Java program to update an ArrayList element by comparing its value with a threshold and replacing it conditionally.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want to enter?");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }

            System.out.println("Original list: " + list);

            System.out.println("Enter the threshold value: ");
            int threshold = sc.nextInt();

            List<Integer> modifiedList = list.stream()
                    .map(i -> i > threshold ? threshold : i)
                    .collect(Collectors.toList());

            System.out.println("Modified list with the reference value: " + modifiedList);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

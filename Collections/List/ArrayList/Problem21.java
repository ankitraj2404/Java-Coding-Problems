
//Write a Java program to replace all occurrences of a specific value in an ArrayList with another value using streams.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want to enter?");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                int num = sc.nextInt();
                list.add(num);
            }

            System.out.println("Orgininal list: " + list);

            System.out.println("Enter the element that you want to remove from the list: ");
            int valueToRemove = sc.nextInt();

            List<Integer> modifiedList = list.stream()
                    .filter(i -> i != valueToRemove)
                    .collect(Collectors.toList());
            System.out.println("List after removing all occurences of " + valueToRemove + ": " + modifiedList);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want?");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }
            System.out.println("Original list: " + list);
            Collections.sort(list);
            System.out.println("List after sorting: " + list);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

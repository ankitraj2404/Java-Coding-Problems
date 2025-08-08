
//Write a Java program to insert multiple elements at the first position of an ArrayList using addAll() with index 0.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many values do you want: ");
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            while (size > 0) {
                list.add(sc.nextInt());
                size--;
            }
            System.out.println("original List: " + list);

            List<Integer> element = List.of(1, 2, 3, 4);

            list.addAll(0, element);

            System.out.println("list after addition of collection of other integer objects: " + list);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

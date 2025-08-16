
//Write a Java program to iterate through a linked list using an iterator and print each element with its index.
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Problem7 {
    public static void main(String[] args) {
        try {
            LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));

            System.out.println("iteration using for loop: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Index: " + i + ", Element: " + list.get(i));
            }
            System.out.println("---------------------------");
            System.out.println("Iteration using Stream: ");
            IntStream.range(0, list.size())
                    .forEach(i -> System.out.println("Index: " + i + ", Element: " + list.get(i)));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

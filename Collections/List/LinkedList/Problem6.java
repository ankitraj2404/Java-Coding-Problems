
//Write a Java program to iterate through all elements in a linked list.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Problem6 {
    public static void main(String[] args) {
        try {
            LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));
            Iterator<Integer> it = list.iterator();

            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

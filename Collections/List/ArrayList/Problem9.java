
//Write a Java program to iterate over an ArrayList using a for-each loop and conditionally print only the elements that meet a specific pattern.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many values do you want?");
            int values = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Enter elements: ");
            while (values > 0) {
                list.add(sc.nextInt());
                values--;
            }

            System.out.println("Original List: " + list);

            ArrayList<Integer> evenNumbers = list.stream()
                    .filter(e -> e % 2 == 0)
                    .collect(Collectors.toCollection(ArrayList::new));

            System.out.println("Even numbers in the list: " + evenNumbers);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

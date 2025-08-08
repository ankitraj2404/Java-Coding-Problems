
//Write a Java program to insert a color at the first position in an ArrayList and then rotate the list so that the inserted element becomes the last element.
import java.util.ArrayList;
import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many values do you want: ");
            int size = sc.nextInt();
            sc.nextLine();

            ArrayList<String> list = new ArrayList<>();

            while (size > 0) {
                list.add(sc.nextLine());
                size--;
            }

            System.out.println("original List: " + list);

            System.out.println("Enter a value to add at the first position: ");
            String str = sc.nextLine();

            list.add(0, str);
            int n = list.size();
            System.out.println("List after adding " + str + " at the first position: " + list);

            for (int i = 0, j = n - 1; i < j; i++, j--) {

                String temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }

            System.out.println("List after rotation: " + list);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

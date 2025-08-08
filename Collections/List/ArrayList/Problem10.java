
//Write a Java program to iterate through an ArrayList and simultaneously update each element by appending its length, then print the updated list.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many elements do you want?");
            int size = sc.nextInt();
            sc.nextLine();// consume left over line

            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                list.add(sc.nextLine());
            }

            System.out.println("Original List: " + list);

            ArrayList<String> stringWithLength = list.stream()
                    .map(str -> {
                        StringBuilder sb = new StringBuilder(str);
                        sb.append(str.length());
                        return sb.toString();
                    })
                    .collect(Collectors.toCollection(ArrayList::new));

            System.out.println("List with their length: " + stringWithLength);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

//Write a Java program to create a lambda that validates a list of strings, returning true only if all are empty.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Problem5 {
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        System.out.println("How many words you want to enter?");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.println("Enter " + i + " word: ");
            String word = sc.nextLine();
            words.add(word);
        }

        Predicate<String> check = s -> s.isEmpty();

        boolean allEmpty = words.stream().allMatch(check);

        if (allEmpty) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
        sc.close();
    }
}

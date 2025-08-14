//Write a Java program to sort an array of words by the number of vowels each word contains.

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static int countVowels(String str) {
        return (int) str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            sc.nextLine();

            String[] array = new String[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextLine();
            }

            System.out.print("Original array: ");
            for (String s : array) {
                System.out.print(s + " ");
            }
            System.out.println();
            Arrays.sort(array, (a, b) -> {
                int cmp = Integer.compare(countVowels(a), countVowels(b));
                return cmp != 0 ? cmp : a.compareToIgnoreCase(b);
            });
            System.out.println(
                    "After sorting array on the basis of vowels count in each string: " + Arrays.toString(array));

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

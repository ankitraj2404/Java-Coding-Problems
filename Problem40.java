//Program to find the shortest string in the array of string

import java.util.*;

public class Problem40 {

    public String findShortestWord(String[] words) // Method to find the shortest string
    {
        int len = words.length;
        String shortest = words[0];

        for (int i = 1; i < len; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();

        // Declare and initialize array
        String[] words = new String[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter word at " + i + " :");
            words[i] = sc.nextLine();
            System.out.println();
        }

        Problem40 obj = new Problem40();
        String shortest = obj.findShortestWord(words);
        System.out.println("Shortest String: " + shortest);
        sc.close();

    }

}

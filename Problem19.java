//Program to print the Arithmetic Progression Series(AP)

import java.util.*;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the starting number: ");
            int initial_term = sc.nextInt();

            System.out.println("Enter the common difference: ");
            int cm_diff = sc.nextInt();

            System.out.println("Enter the numbers of term: ");
            int terms = sc.nextInt();

            // First term
            System.out.print("Arithemtic Progression: ");
            System.out.print(initial_term);
            for (int i = 1; i < terms; i++) {
                initial_term += cm_diff;
                System.out.print(" , " + initial_term);
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid values");
        }
    }

}

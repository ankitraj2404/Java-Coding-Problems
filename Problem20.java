//Program to print the Geometric Progression series (GP) 

import java.util.*;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the initial term: ");
            int initial_term = sc.nextInt();

            System.out.println("Enter the common ratio: ");
            int cmn_ratio = sc.nextInt();

            System.out.println("Enter the number of terms: ");
            int terms = sc.nextInt();

            // Display First Term

            System.out.print("Geometric Progression: ");
            System.out.print(initial_term);

            for (int i = 1; i < terms; i++) {
                initial_term *= cmn_ratio;
                System.out.print(" , " + initial_term);
            }
            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("Enter valid values");
        }
    }

}

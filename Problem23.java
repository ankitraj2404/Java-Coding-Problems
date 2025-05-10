//Program to print the patter

import java.util.*;

public class Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of rows and columns: ");
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid values");
        }
    }
}
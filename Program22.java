//Program to print a rectangle pattern of a number

import java.util.*;

public class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the no of rows and columns: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= col; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter only valid values");

        }
        sc.close();
    }

}

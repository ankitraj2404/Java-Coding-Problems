//Program to perform addition of two matrices

import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take the number of rows and columns for the first matrix
            System.out.println("Enter the no of rows and columns of first matrix: ");
            int row1 = sc.nextInt();
            int col1 = sc.nextInt();

            // Declare array
            int[][] matrix1 = new int[row1][col1];

            // Take the elements
            System.out.println("Enter the elements of first matrix: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print("Enter the element at [" + i + "] [" + j + "]: ");
                    matrix1[i][j] = sc.nextInt();
                    System.out.println();
                }
            }

            // Display first matrix
            System.out.print("First matrix: ");
            System.out.println();
            for (int x[] : matrix1) {
                for (int y : x) {
                    System.out.print(y + "\t");
                }
                System.out.println();
            }

            // Take the number of rows and columns for the second matrix
            System.out.println("Enter the no of rows and columns of second matrix: ");
            int row2 = sc.nextInt();
            int col2 = sc.nextInt();

            // Declare array
            int[][] matrix2 = new int[row2][col2];

            // Take the elements
            System.out.println("Enter the elements of second matrix: ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print("Enter the element at [" + i + "] [" + j + "]: ");
                    matrix2[i][j] = sc.nextInt();
                    System.out.println();
                }
            }

            // Display second matrix
            System.out.print("Second matrix: ");
            System.out.println();
            for (int x[] : matrix2) {
                for (int y : x) {
                    System.out.print(y + "\t");
                }
                System.out.println();
            }

            // Check condition for performing addition
            if (row1 != row2 || col1 != col2) {
                System.out.println("Addition can't be performed");
                return;
            }
            int[][] sum = new int[row1][col1]; // Array to store the result

            // Perform addition
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Display the result matrix
            System.out.println("Matrix after addition: ");
            for (int x[] : sum) {
                for (int y : x) {
                    System.out.print(y + "\t");
                }
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter valid inputs");
        } finally {
            sc.close();
        }
    }

}

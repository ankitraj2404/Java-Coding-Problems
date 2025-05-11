/*Program to print the rectangle pattern

1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5 
1 2 3 4 5

*/

import java.util.*;

public class problem22 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of rows and columns: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= col; j++) {
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
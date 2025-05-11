/*Program to print the following pattern

    1 
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

*/

import java.util.*;

public class Problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the no of rows: ");
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                int count = 1;
                for (int j = 1; j <= row; j++) {
                    if (i + j <= row) {
                        System.out.print(" ");
                    } else {
                        System.out.print(count + " ");
                        count++;
                    }
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println();
        }
        sc.close();
    }
}
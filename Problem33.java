
/* Program to print the following pattern

1 2 3 4 5 
 1 2 3 4
  1 2 3
   1 2
    1

*/

import java.util.*;

public class Problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            int counter = 1;
            for (int j = 1; j <= row; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(counter + " ");
                    counter++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
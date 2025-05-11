
/*Program to print the  following pattern

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/

import java.util.*;

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the no of rows: ");
            int row = sc.nextInt();

            int counter = 0;
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++) {
                    counter++;
                    System.out.print(counter + " ");
                }
                System.out.println();
            }
            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("Enter valid values");
        }
    }
}


//Write a java program to remove the third element
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            ArrayList<Integer> myArrayList = new ArrayList<>();

            System.out.print("Enter elements" + "\n");

            for (int i = 0; i < size; i++) {
                myArrayList.add(sc.nextInt());
            }

            // Display arraylist
            System.out.println("Array List: ");
            for (Integer i : myArrayList) {
                System.out.print(i + ", ");
            }
            System.out.println();

            myArrayList.remove(3);

            // ArrayList After removal of third index
            System.out.print("ArrayList after removal of third index element: ");
            for (Integer i : myArrayList) {
                System.out.print(i + ", ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}

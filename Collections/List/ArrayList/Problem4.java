
//Write a java progrsm to update the arraylist element
import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {

    static class IndexNotFoundException extends Exception { // Custom exception
        public IndexNotFoundException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            // Declare an Integer ArrayList
            ArrayList<Integer> myArrayList = new ArrayList<Integer>();
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                myArrayList.add(sc.nextInt());
            }

            // Display arraylist
            System.out.print("Array List: ");
            for (int i : myArrayList) {
                System.out.print(i + " ");
            }
            System.out.println();

            System.out.print("Enter the index value you want to update: ");
            int index = sc.nextInt();
            System.out.print("Enter the element: ");
            int element = sc.nextInt();

            if (index < 0 || index >= size) {
                throw new IndexNotFoundException("Index should be between 0 and " + (size - 1));
            } else {
                myArrayList.set(index, element);
            }

            // ArrayList after updating
            System.out.print("Array List after updating: ");
            for (int i : myArrayList) {
                System.out.print(i + " ");
            }

        } catch (IndexNotFoundException e) {
            System.out.println("Custom exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

}


//Write a java program to retrieve element by index value
import java.util.*;

class IndexNotFoundException extends Exception { // Custom exception
    public IndexNotFoundException(String message) {
        super(message);
        System.out.println("Index size shouble be between 0 and (Size - 1)");
    }
}

public class Problem3 {
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

            System.out.println("Enter the index value to retrieve element: ");
            int index = sc.nextInt();

            if (index < 0 || index >= size) {
                throw new IndexNotFoundException("Index should be between 0 and " + (size - 1));
            } else {
                System.out.println("Element at index " + index + ": " + myArrayList.get(index));
            }
        } catch (IndexNotFoundException e) {
            System.out.println("Custom exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
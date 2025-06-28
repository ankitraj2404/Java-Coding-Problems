
//Write a Java program to shuffle an ArrayList multiple times and check if the order changes with each shuffle.
import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the arrayList: ");
            int size = sc.nextInt();

            ArrayList<Integer> myArrayList = new ArrayList<>();

            System.out.println("Enter elements: ");
            // Take input from user
            for (int i = 0; i < size; i++) {
                myArrayList.add(sc.nextInt());
            }

            // Display array
            System.out.println("Original ArrayList: " + myArrayList);

            // Clone the original list for comparison
            ArrayList<Integer> previousOrder = new ArrayList<>(myArrayList);

            System.out.print("Enter how many times you want to shuffle the arraylist: ");
            int shuffleCount = sc.nextInt();

            // shuffling of arraylist
            for (int i = 0; i < shuffleCount; i++) {
                Collections.shuffle(myArrayList);
                System.out.print("Shuffle " + (i + 1) + ": " + myArrayList);
                if (myArrayList.equals(previousOrder)) {
                    System.out.print("Order did not changed");
                } else {
                    System.out.print(" Order Changed");
                }

                // Update previous order correctly
                previousOrder = new ArrayList<>(myArrayList);
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input " + e);
        }
    }

}

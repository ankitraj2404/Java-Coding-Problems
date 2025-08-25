// Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Restaurant {

    private Map<String, Double> menu;
    private Map<String, Integer> ratings;

    public Restaurant() {
        menu = new HashMap<>();
        ratings = new HashMap<>();
    }

    // Method to add item
    public void addItem(String itemName, Double itemPrice, int rating) {

        if (menu.containsKey(itemName)) {
            System.out.println("Item already exist");
            return;
        }
        if (rating < 1 || rating > 5) {
            System.out.println("Please rate between 1 - 5");
            return;
        }
        menu.put(itemName, itemPrice);
        ratings.put(itemName, rating);

        System.out.println(itemName + " added to the menu");
    }

    // Method to remove item
    public void removeItem(String itemName) {
        if (menu.containsKey(itemName)) {
            menu.remove(itemName);
            ratings.remove(itemName);
            System.out.println(itemName + "removed from the menu");
        } else {
            System.out.println(itemName + "Item not found in the menu");
        }
    }

    // Method to calculate rating
    public double averageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int rating : ratings.values()) {
            total += rating;
        }

        return (double) total / ratings.size();

    }

    public void displayMenu() {
        for (String item : menu.keySet()) {
            System.out.println(item + " - &" + menu.get(item) + " Ratings: " + ratings.get(item));
        }
    }
}

public class Problem63 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Restaurant myRestaurant = new Restaurant();

            System.out.println("---------Welcome-----------");
            System.out.println("How many items you want to add ?");
            int count = sc.nextInt();
            sc.nextLine();

            while (count > 0) {
                System.out.print("Enter the name of the item to add: ");
                String itemName = sc.nextLine();

                System.out.print("Enter the price for the item: ");
                double itemPrice = sc.nextDouble();

                System.out.print("Enter the rating for the item: ");
                int rating = sc.nextInt();
                sc.nextLine();

                myRestaurant.addItem(itemName, itemPrice, rating);
                count--;
            }

            double average = myRestaurant.averageRating();
            System.out.print("Average rating: " + average);

            System.out.print("Do you want to remove item?(yes or no)");
            String ans = sc.nextLine();

            if (ans.equals("Yes") || ans.equals("yes")) {
                myRestaurant.displayMenu();
                System.out.println("Enter the item name to remove: ");
                String removeItemName = sc.nextLine();
                myRestaurant.removeItem(removeItemName);
                System.out.println("Menu after removal of " + removeItemName);
                System.out.println("-------------------------------");
                myRestaurant.displayMenu();
                System.out.println("-------------------------------");
            }

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
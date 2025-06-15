
/*
 Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, 
 and to check for low inventory.
 */
import java.util.*;

class Inventory {

    Products product[] = new Products[100];
    int count = 0;

    public void addProduct(Products newProduct) {
        product[count++] = newProduct;
        System.out.println("Product Added Successfully");
    }

    public void removeProduct(String productID) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (product[i].getProductID().equals(productID)) {
                for (int j = i; j < count - 1; j++) {
                    product[j] = product[j + 1];
                }
                product[--count] = null;
                System.out.println("Removed successfully");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Product Not found");
        }
    }

    public void checkInventory(String productID) {
        boolean lowFound = false;
        for (int i = 0; i < count; i++) {
            if (product[i].getQuantity() < 5) {
                System.out.println(productID + " is low in inventory.");
                lowFound = true;
            }
        }
        if (!lowFound) {
            System.out.println("All products are sufficiently stocked.");
        }
    }

    public void showAllInventory() {
        for (int i = 0; i < count; i++) {
            product[i].display();
        }
    }

}

class Products {
    private String productName;
    private String productID;
    private int productQuantity;

    public Products(String productName, String productID) {
        this.productName = productName;
        this.productID = productID;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductID() {
        return productID;
    }

    public int getQuantity() {
        return productQuantity;
    }

    public void display() {
        System.out.print("-----------------------------" + "\n");
        System.out.print("Product name: " + this.productName + "\n");
        System.out.print("Product ID: " + this.productID + "\n");
        System.out.print("Product Quantity: " + this.productQuantity + "\n");
        System.out.print("---------------------------" + "\n");
    }
}

public class Problem57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory(); // Inventory Object

        try {
            while (true) {
                System.out.println("1. Add new product");
                System.out.println("2. Remove existing product");
                System.out.println("3. Check Quantity of product");
                System.out.println("4. Display all product");
                System.out.println("5. Exit");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the name of the roduct: ");
                        String productName = sc.nextLine();
                        System.out.println("Enter the ID of the product: ");
                        String productID = sc.nextLine();

                        Products product1 = new Products(productName, productID); // Product Object
                        System.out.println("Enter quantity of the product: ");
                        int productQuantity = sc.nextInt();
                        product1.setProductQuantity(productQuantity);
                        inventory.addProduct(product1);
                        break;

                    case 2:
                        System.out.println("Enter the ID of the product for removal: ");
                        String removalID = sc.nextLine();
                        inventory.removeProduct(removalID);
                        break;

                    case 3:
                        System.out.println("Enter the ID of the product to check availability: ");
                        String quantityCheckId = sc.nextLine();
                        inventory.checkInventory(quantityCheckId);
                        break;
                    case 4:
                        inventory.showAllInventory();
                        break;

                    case 5:
                        System.out.println("Thank you........Exiting");
                        sc.close();
                        return;

                    default:
                        System.out.println("Inavlid choice");

                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        }
    }

}

import java.util.InputMismatchException;
import java.util.Scanner;

class Product {// Product Class
    String name;
    String ItemNO;
    int price;
    int qty;

    public String getName() {
        return name;
    }

    public String getItemNo() {
        return ItemNO;
    }

    public int getPrice() {
        return price;
    }

    public int getqty() {
        return qty;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int qty) {
        this.qty = qty;
    }

    public Product(String itemNo, String Name) {
        this.ItemNO = itemNo;
        this.name = Name;
    }

    public String toString() {
        return "Product Name: " + name + "\n"
                + "Product Id: " + ItemNO + "\n"
                + "Product Price: " + price + "\n"
                + "Product qty: " + qty;
    }
}

// Customer Class
class Customer {

    String cust_Name;
    String cust_Id;
    int mobNo;
    String address;

    public String getName() {
        return cust_Name;
    }

    public String getCustomerId() {
        return cust_Id;
    }

    public String getAddress() {
        return address;
    }

    public int getMobileNo() {
        return mobNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNo(int mobNo) {
        this.mobNo = mobNo;
    }

    // Constructor
    public Customer(String name, String custId) {
        this.cust_Name = name;
        this.cust_Id = custId;

    }

    public String toString() {
        return "Customer Name: " + cust_Name + "\n"
                + "Customer ID: " + cust_Id + "\n"
                + "Customer Address: " + address + "\n"
                + "Customer Mobile Number: " + mobNo;
    }

}

public class Problem45 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the name and Item no of the Product: ");
            String name = sc.nextLine();
            String ItemNO = sc.nextLine();

            System.out.println("Enter the price and quantity of the product: ");
            int price = sc.nextInt();
            int qty = sc.nextInt();
            sc.nextLine();

            Product myProduct = new Product(ItemNO, name);
            myProduct.price = price;
            myProduct.qty = qty;

            // Customer Details
            System.out.println("Enter the name and Customer ID: ");
            String cust_Name = sc.nextLine();
            String cust_Id = sc.nextLine();

            System.out.println("Enter the customer address and mobile no: ");
            String address = sc.nextLine();
            int mobNo = sc.nextInt();

            Customer newCustomer = new Customer(cust_Name, cust_Id);
            newCustomer.address = address;
            newCustomer.mobNo = mobNo;

            System.out.println(myProduct);
            System.out.println("------------------------------------");

            System.out.println(newCustomer);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}
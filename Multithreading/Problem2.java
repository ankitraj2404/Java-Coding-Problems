
//Practice Program....
import java.util.Scanner;

class ATM {

    synchronized public void checkBalance(String name) {
        System.out.println(name + " is checking balance");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void withdrawAmount(String name, int amount) {
        System.out.println(name + " is withdrawing " + amount);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Customer extends Thread {
    ATM atmMachine;
    String name;
    int amount;

    Customer(String name, ATM atmMachine, int amount) {
        this.name = name;
        this.atmMachine = atmMachine;
        this.amount = amount;
    }

    public void run() {
        atmMachine.checkBalance(name);
        atmMachine.withdrawAmount(name, amount);
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer 1 name: ");
        String customer1 = sc.nextLine();
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter customer 2 name: ");
        String customer2 = sc.nextLine();
        System.out.println("Enter the amount: ");
        int amount2 = sc.nextInt();

        ATM atmMachine = new ATM();
        Customer cust1 = new Customer(customer1, atmMachine, amount);
        Customer cust2 = new Customer(customer2, atmMachine, amount2);

        cust1.start();
        cust2.start();
        sc.close();

    }
}
/* Write a Java program to create a class called "Bank" with a collection of
  accounts and methods to add and remove accounts,
and to deposit and withdraw money. Also define a class called "Account" to
  maintain account details of a particular customer. */

import java.util.*;

class Account {
    private String accountHolderName;
    private long accountNo;
    private double balance;

    public Account(String accountHolderName, long accountNo) {
        this.accountHolderName = accountHolderName;
        this.accountNo = accountNo;
        this.balance = 0.0;
    }

    public void depositAmount(double depAmount) {
        if (depAmount > 0) {
            balance += depAmount;
            System.out.println(depAmount + " Deposited Successfully");
        } else {
            System.out.println("Enter valid amount");
        }
    }

    public void withdrawAmount(double debtAmount) {
        if (debtAmount > 0 && debtAmount <= balance) {
            balance -= debtAmount;
            System.out.println(debtAmount + " Debited Successfully");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public long getAccountNumber() {
        return accountNo;
    }

    public String display() {
        return "Account Holder Name: " + accountHolderName + "\n"
                + "Account Number: " + accountNo + "\n" +
                "Balance: " + balance;
    }
}

class Bank {
    private Account account[] = new Account[100];
    private int count = 0;

    public void addAccount(Account acc) {
        account[count++] = acc;
        System.out.println("Account Created");
    }

    public void removeAccount(long accNo) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (account[i].getAccountNumber() == accNo) {
                for (int j = i; j < count - 1; j++) {
                    account[j] = account[j + 1];
                }
                account[--count] = null;
                found = true;
                System.out.println("Account removed successfully");
            }
        }
        if (!found) {
            System.out.println("Account no not found");
        }
    }

    public Account findAccount(long accNo) {
        for (int i = 0; i < count; i++) {
            if (account[i].getAccountNumber() == accNo) {
                return account[i];
            }
        }
        return null;
    }

    public void showAllAccount() {
        if (count == 0) {
            System.out.println("No Account Available");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("--------------------------------");
            System.out.println(account[i].display());
            System.out.println("--------------------------------");
        }
    }
}

public class Problem51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Bank bank = new Bank();
            while (true) {
                System.out.println("----------------------------------");
                System.out.println("1. Open New Account");
                System.out.println("2. Remove Existing Account");
                System.out.println("3. Deposit Amount");
                System.out.println("4. Withdraw Amount");
                System.out.println("5. Display All account");
                System.out.println("6. Exiting");
                System.out.println("----------------------------------");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter your Name and Account Number: ");
                        String accountHolderName = sc.nextLine();
                        long accountNo = sc.nextLong();

                        Account acc = new Account(accountHolderName, accountNo);
                        bank.addAccount(acc);
                        break;
                    case 2:
                        System.out.println("Enter Account number to remove: ");
                        long remAccNo = sc.nextLong();
                        bank.removeAccount(remAccNo);
                        break;
                    case 3:
                        System.out.println("Enter account no to deposit amount: ");
                        long depAccountNo = sc.nextLong();
                        System.out.println("Enter amount to deposit: ");
                        double depAmount = sc.nextDouble();

                        Account depAccount = bank.findAccount(depAccountNo);
                        if (depAccount != null) {
                            depAccount.depositAmount(depAmount);
                        } else {
                            System.out.println("Account not found");
                        }
                        break;

                    case 4:
                        System.out.println("Enter account no to withdraw amount: ");
                        long withdrawAccountNo = sc.nextLong();
                        System.out.println("Enter amount to deposit: ");
                        double withdrawAmount = sc.nextDouble();

                        Account withdrawAccount = bank.findAccount(withdrawAccountNo);
                        if (withdrawAccount != null) {
                            withdrawAccount.withdrawAmount(withdrawAmount);
                        } else {
                            System.out.println("Account not found");
                        }
                        break;
                    case 5:
                        bank.showAllAccount();
                        break;

                    case 6:
                        System.out.println("Exiting");
                        System.out.println("Thank your");
                        return;

                    default:
                        System.out.println("Invalid Choice");

                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}

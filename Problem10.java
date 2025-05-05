//Program to find the type of website and protocol

import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the URL: ");
        String url = sc.nextLine().toLowerCase();

        if (url.startsWith("http")) {
            System.out.println("Type of protocol is: Hyper Text Transfer Protocol");
        } else if (url.startsWith("ftp")) {
            System.out.println("type of protocol is: File Transfer Protocol");
        }

        if (url.endsWith("com")) {
            System.out.println("Type of website is: Commercial website");
        } else if (url.endsWith("org")) {
            System.out.println("Type of website is: Organisational website");
        } else if (url.endsWith("gov")) {
            System.out.println("Type of website is: Government website");
        }
        sc.close();
    }
}

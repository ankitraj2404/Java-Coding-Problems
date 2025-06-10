import java.util.InputMismatchException;
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age;
    }
}

public class Problem47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Name and Age: ");
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();

            Person person1 = new Person(name, age); // 1st instance of the class

            System.out.println("Enter the Name and Age of the another person: ");
            String name2 = sc.nextLine();
            int age2 = sc.nextInt();

            Person person2 = new Person(name2, age2); // 2nd instance of the class
            System.out.println("--------------------------");
            System.out.println(person1);
            System.out.println("--------------------------");
            System.out.println(person2);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }

}

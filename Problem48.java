import java.util.Scanner;

class Dog {
    private String name;
    private String breed;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String toString() {
        return "Name: " + name + "\n"
                + "Breed: " + breed;
    }
}

public class Problem48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name and Breed of your Dog: ");
        String name = sc.nextLine();
        String breed = sc.nextLine();

        System.out.println("Enter the Name and Breed of the other Dog: ");
        String name2 = sc.nextLine();
        String breed2 = sc.nextLine();

        Dog dog1 = new Dog(name, breed);
        Dog dog2 = new Dog(name2, breed2);

        System.out.println("----------------------------");
        System.out.println(dog1);
        System.out.println("----------------------------");
        System.out.println(dog2);
        System.out.println("----------------------------");

        System.out.println("Do you want to change the name and breed of your dog(Press y for yes and n for no)");
        char ch = sc.next().charAt(0);
        sc.nextLine();

        if (ch == 'y' || ch == 'Y') {
            System.out.println("Enter the Name and Breed for the first dog: ");
            String newName1 = sc.nextLine();
            String newBreed1 = sc.nextLine();

            // Calling setter methods for setting the updated values
            dog1.setName(newName1);
            dog1.setBreed(newBreed1);

            System.out.println("Enter the Name and Breed for the second dog: ");
            String newName2 = sc.nextLine();
            String newBreed2 = sc.nextLine();

            // Calling setter methods for setting the updated values
            dog2.setName(newName2);
            dog2.setBreed(newBreed2);

            // call toString methods
            System.out.println("--------------------------------");
            System.out.println(dog1);
            System.out.println("----------------------------");
            System.out.println(dog2);
            System.out.println("----------------------------");
        } else {
            System.out.println("Thank you for using us");
        }
    }

}

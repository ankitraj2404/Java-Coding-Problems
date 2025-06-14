
/* Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses. */
import java.util.*;

class Student {
    private String studentName;
    private char grade;

    private Courses[] course = new Courses[100];
    int count = 0;

    public void addCourse(Courses Subject) {

        course[count++] = Subject;
        System.out.println("Course Added Successfully");

    }

    public void removeCourses(String courseID) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (course[i].getCourseID().equals(courseID)) {
                for (int j = i; j < count - 1; j++) {
                    course[j] = course[j + 1];
                }
                course[--count] = null;
                System.out.println("Removed Successfully");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Course Not Found");
        }
    }

    public void showAllCourse() {
        for (int i = 0; i < count; i++) {
            course[i].display();
        }
    }

    public Student(String studentName, char grade) {
        this.studentName = studentName;
        this.grade = grade;
    }

}

class Courses {

    private String courseName;
    private String courseID;

    public Courses(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void display() {
        System.out.println("-----------------------------");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseID);
        System.out.println("-----------------------------");
    }

}

public class Problem54 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String studentName = sc.nextLine();
        System.out.println("Enter your Grade: ");
        char grade = sc.next().charAt(0);
        Student stud1 = new Student(studentName, grade);

        while (true) {
            System.out.println("-----------------------");
            System.out.println("1. Add New Course");
            System.out.println("2. Remove course");
            System.out.println("3. Display All Course");
            System.out.println("4. Exit");
            System.out.println("-----------------------");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Subject Name: ");
                    String subjectName = sc.nextLine();
                    System.out.println("Enter Subject ID: ");
                    String subjectID = sc.nextLine();
                    Courses Subject = new Courses(subjectName, subjectID);
                    stud1.addCourse(Subject);
                    break;

                case 2:
                    System.out.println("Enter subject ID to remove: ");
                    String courseID = sc.nextLine();
                    stud1.removeCourses(courseID);
                    break;

                case 3:
                    stud1.showAllCourse();
                    break;

                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }

}

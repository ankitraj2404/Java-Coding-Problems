/* Write a Java program to create a class called "School" with attributes for students, teachers, and classes, 
and methods to add and remove students and teachers, and to create classes. */

import java.util.*;

class School { // School class
    private Student[] students = new Student[50];
    private Teacher[] teachers = new Teacher[50];
    private Classes[] newClass = new Classes[50];
    int studentCount = 0;
    int teacherCount = 0;
    int classCount = 0;

    public void addStudent(Student stud) { // Add student
        students[studentCount++] = stud;
        System.out.println("New student added successfully");
    }

    public void removeStudent(int studentRollNo) { // Remove student
        if (studentCount == 0) {
            System.out.println("No students found in the class");
            return;
        }
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentRollNo() == studentRollNo) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;
                found = true;
                System.out.println("Removed successfully");
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }

    public void showAllStudents() { // Show All students
        for (int i = 0; i < studentCount; i++) {
            students[i].display();
        }
    }

    public void addTeacher(Teacher teacher) { // Add teacher
        teachers[teacherCount++] = teacher;
        System.out.println("New teacher added");
    }

    public void removeTeacher(String teacherID) { // Remove student
        if (teacherCount == 0) {
            System.out.println("No teacher found in the class");
            return;
        }
        boolean found = false;
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].getTeacherID().equals(teacherID)) {
                for (int j = i; j < teacherCount - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }
                teachers[--teacherCount] = null;
                found = true;
                System.out.println("Removed successfully");
            }
        }
        if (!found) {
            System.out.println("Teacher not found");
        }
    }

    public void showAllTeachers() { // Show All teacher
        for (int i = 0; i < teacherCount; i++) {
            teachers[i].display();
        }
    }

    public void addClass(Classes class1) { // Add Class
        newClass[classCount++] = class1;
        System.out.println("Class Added successfully");
    }

    public void showAllClass() { // Show All Class
        for (int i = 0; i < classCount; i++) {
            newClass[i].display();
        }
    }

}

class Student { // Student class
    private String studentName;
    private int studentRollNo;

    public Student(String studentName, int studentRollNo) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void display() {
        System.out.print("------------------------------------" + "\n");
        System.out.print("Student Name: " + studentName + "\n");
        System.out.print("Student Roll no: " + studentRollNo + "\n");
        System.out.print("------------------------------------" + "\n");
    }

}

class Teacher { // Teacher class
    private String teacherName;
    private String teacherOfSubject;
    private String teacherID;

    public Teacher(String teacherName, String teacherOfSubject) {
        this.teacherName = teacherName;
        this.teacherOfSubject = teacherOfSubject;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void display() {
        System.out.print("------------------------------------" + "\n");
        System.out.print("Teacher Name: " + teacherName + "\n");
        System.out.print("Subject of teacher: " + teacherOfSubject + "\n");
        System.out.print("Teacher ID: " + teacherID + "\n");
        System.out.print("------------------------------------" + "\n");

    }
}

class Classes { // class Classes
    private String classOfSubject;
    private String classID;

    public Classes(String classOfSubject, String classID) {
        this.classOfSubject = classOfSubject;
        this.classID = classID;
    }

    public void display() {
        System.out.print("------------------------------------" + "\n");
        System.out.print("Class Name: " + classOfSubject + "\n");
        System.out.print("Class ID: " + classID + "\n");
    }
}

public class Problem58 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        School myschool = new School();

        try {
            System.out.println("Welcome to School");
            while (true) {
                System.out.println("1. Add New Student");
                System.out.println("2. Add New Teacher");
                System.out.println("3. Add New Course");
                System.out.println("4. Remove Existing student");
                System.out.println("5. Remove Existing Teacher");
                System.out.println("6. Show all student");
                System.out.println("7. Show all teacher");
                System.out.println("8. Show all class");
                System.out.println("9. Exit");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter your Name and Roll No: ");
                        String studentName = sc.nextLine();
                        int studentRollNo = sc.nextInt();
                        sc.nextLine();
                        Student student1 = new Student(studentName, studentRollNo);
                        myschool.addStudent(student1);
                        break;

                    case 2:
                        System.out.println("Enter your name and subject that you know: ");
                        String teacherName = sc.nextLine();
                        String teacherOfSubject = sc.nextLine();

                        Teacher teacher1 = new Teacher(teacherName, teacherOfSubject);
                        System.out.println("Enter your ID: ");
                        String teacherID = sc.nextLine();
                        teacher1.setTeacherID(teacherID);
                        myschool.addTeacher(teacher1);
                        break;

                    case 3:
                        System.out.println("Enter Subject name: ");
                        String classOfSubject = sc.nextLine();
                        System.out.println("Enter class Id: ");
                        String classID = sc.nextLine();
                        Classes newClasses = new Classes(classOfSubject, classID);
                        myschool.addClass(newClasses);
                        break;

                    case 4:
                        System.out.println("Enter student roll no to remove: ");
                        int removeStudentId = sc.nextInt();
                        sc.nextLine();
                        myschool.removeStudent(removeStudentId);
                        break;

                    case 5:
                        System.out.println("Enter teacher ID to remove: ");
                        String removeTeacherId = sc.nextLine();
                        myschool.removeTeacher(removeTeacherId);
                        break;

                    case 6:
                        myschool.showAllStudents();
                        break;

                    case 7:
                        myschool.showAllTeachers();
                        break;

                    case 8:
                        myschool.showAllClass();
                        break;

                    case 9:
                        System.out.println("Thank you.....Exiting");
                        return;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}

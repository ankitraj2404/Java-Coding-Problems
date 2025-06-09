import java.util.*;

//Subject Class
class Subject {
    private String SubName;
    private String SubId;
    private int maxMarks;
    private int marksObtain;

    public String getName() {
        return SubName;
    }

    public String getId() {
        return SubId;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    public Subject(String SubName, String SubId) {
        this.SubName = SubName;
        this.SubId = SubId;
    }

    public String toString() {
        return "Subject Name: " + SubName + "\n"
                + "Subject Id: " + SubId + "\n"
                + "Marks Obtain: " + marksObtain + "\n"
                + "Maximum Marks: " + maxMarks + "\n";
    }
}

public class Problem46 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the No of subjects: ");
            int count = sc.nextInt();
            sc.nextLine();

            Subject subs[] = new Subject[count];
            for (int i = 0; i < count; i++) {
                System.out.println("Enter the subject Name and ID: ");
                String SubName = sc.nextLine();
                String SubId = sc.nextLine();
                System.out.println("Enter marks obtain by the student: ");
                int marksObtain = sc.nextInt();
                System.out.println("Enter the Maximum Marks for the subject: ");
                int maxMarks = sc.nextInt();
                sc.nextLine();

                subs[i] = new Subject(SubName, SubId);
                subs[i].setMarksObtain(marksObtain);
                subs[i].setMaxMarks(maxMarks);
            }
            // Display the Array of objects
            for (Subject s : subs) {
                System.out.println("------------------------");
                System.out.println(s);
                System.out.println("-----------------------");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid inputs");
        } finally {
            sc.close();
        }
    }
}
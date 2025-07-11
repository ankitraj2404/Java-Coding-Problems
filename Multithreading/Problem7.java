//Inter thread communication example: Teacher Student and Whiteboard problem
class Whiteboard {
    String text;
    int noOfStudent = 0;
    int count = 0;

    public void attendance() {
        noOfStudent++;
    }

    synchronized public void writeText(String text) {
        System.out.println("Teacher is writing: " + text);
        while (count != 0) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        this.text = text;
        count = noOfStudent;
        notifyAll();
    }

    synchronized public String readText() {
        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        String t = text;
        count--;
        if (count == 0) {
            notify();
        }
        return t;
    }
}

class Teacher extends Thread {
    Whiteboard board1;

    public Teacher(Whiteboard board1) {
        this.board1 = board1;
    }

    String[] notes = { "Ankit is good.", "Ankit is intelligent", "He loves coding", "end" };

    @Override
    public void run() {
        for (int i = 0; i < notes.length; i++) {
            board1.writeText(notes[i]);
        }
    }
}

class Student extends Thread {
    String name;
    Whiteboard board2;

    public Student(String name, Whiteboard board2) {
        this.name = name;
        this.board2 = board2;
    }

    @Override
    public void run() {
        String text;
        board2.attendance();

        do {
            text = board2.readText();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        } while (!text.equals("end"));
    }
}

public class Problem7 {
    public static void main(String[] args) {
        Whiteboard wb = new Whiteboard();
        Teacher t = new Teacher(wb);

        Student st1 = new Student("1. Ankit", wb);
        Student st2 = new Student("2. Anil", wb);
        Student st3 = new Student("3. Anurag", wb);
        Student st4 = new Student("4. Anuraj", wb);
        Student st5 = new Student("5. Anshu", wb);

        t.start();

        st1.start();
        st2.start();
        st3.start();
        st4.start();
        st5.start();
    }
}
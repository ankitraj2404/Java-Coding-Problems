
//Program to find the overall percentage of 
import java.util.*;

public class Problem12 {

    public static void calculateWeightedAverage() {
        Scanner sc = new Scanner(System.in);

        // Read Weights
        System.out.println("Enter the Assignment weight: ");
        int assignmentWeight = sc.nextInt();

        System.out.println("Enter the Project weight: ");
        int projectWeight = sc.nextInt();

        System.out.println("Enter the Quiz weight: ");
        int quizWeight = sc.nextInt();

        System.out.println("Enter the MidTerm weight: ");
        int midTermWeight = sc.nextInt();

        System.out.println("Enter the final Exam Weight: ");
        int finalExamWeight = sc.nextInt();

        // Read Scores
        System.out.println("Enter the Assignment score: ");
        int assignmentScore = sc.nextInt();

        System.out.println("Enter the Project score: ");
        int projectScore = sc.nextInt();

        System.out.println("Enter the Quiz score: ");
        int quizScore = sc.nextInt();

        System.out.println("Enter the MidTerm score: ");
        int midTermScore = sc.nextInt();

        System.out.println("Enter the final Exam score: ");
        int finalExamScore = sc.nextInt();

        // Use float to match precision expected
        float assignmentPercentageScore = (assignmentWeight / 100.0f) * assignmentScore;
        float projectPercentageScore = (projectWeight / 100.0f) * projectScore;
        float quizPercentageScore = (quizWeight / 100.0f) * quizScore;
        float midTermPercentageScore = (midTermWeight / 100.0f) * midTermScore;
        float finalExamPercentageScore = (finalExamWeight / 100.0f) * finalExamScore;

        float overAllPercentage = assignmentPercentageScore + projectPercentageScore + quizPercentageScore
                + midTermPercentageScore + finalExamPercentageScore;

        // Print exactly as expected
        System.out.println("Weights  % Value of score");
        System.out.println("Assignments " + assignmentPercentageScore);
        System.out.println("Projects " + projectPercentageScore);
        System.out.println("Quizzes " + quizPercentageScore);
        System.out.println("Mid term " + midTermPercentageScore);
        System.out.println("Final Exam " + finalExamPercentageScore);
        System.out.println("The weighted average score is " + overAllPercentage + "%");

        sc.close();
    }

    public static void main(String[] args) {
        calculateWeightedAverage();
    }
}

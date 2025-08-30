// Merge intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem65 {

    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] newInterval = intervals[0];
        List<int[]> result = new ArrayList<>();
        result.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no of rows and col in the array: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            int[][] intervals = new int[row][col];
            System.out.println("Enter elements: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    intervals[i][j] = sc.nextInt();
                }
            }
            int[][] nonOverLappingIntervals = mergeIntervals(intervals);

            for (int i = 0; i < nonOverLappingIntervals.length; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(nonOverLappingIntervals[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

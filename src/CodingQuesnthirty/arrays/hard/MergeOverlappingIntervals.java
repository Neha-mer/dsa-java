package CodingQuesnthirty.arrays.hard;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    //Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    // Output: [[1,6],[8,10],[15,18]]
    //Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

    static void main() {
        int[][] intervals = new int[][]{
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        // Step 1: sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] prev = intervals[0];
        int count = 0;
        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {

            if (intervals[i][0] <= prev[1]) {
                prev[1] = Math.max(intervals[i][1], prev[1]);
            } else {
                merged.add(prev);
                System.out.println(count++);
                prev = intervals[i];
                for (int[] interval : merged) {
                    System.out.println(Arrays.toString(interval));
                }

            }
        }
        merged.add(prev);
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }


    }
}

package CodingQuesnthirty.arrays.easy;

import java.awt.desktop.AppReopenedEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddNewInterval {


    static void main() {
        int[][] intervals = new int[][]{
                {1, 3},
                {6, 9}};
        int[] newInterval = new int[]{2, 5};

        int[] pre = intervals[0];
        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= newInterval[1]) {
                pre[1] = Math.max(intervals[i][1], newInterval[1]);
                //merged.add(pre);
            } else {
                merged.add(pre);
                pre = intervals[i];
            }
        }
        merged.add(pre);
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));

        }
    }
}

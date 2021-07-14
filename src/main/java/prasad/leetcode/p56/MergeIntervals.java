package prasad.leetcode.p56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] merged = mergeTwoIntervals(currentInterval, intervals[i]);
            if (merged != null) {
                currentInterval = merged;
            }
            else {
                mergedIntervals.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        mergedIntervals.add(currentInterval);

        int[][] returnValue = new int[mergedIntervals.size()][];
        for (int i = 0; i < mergedIntervals.size(); i++) {
            returnValue[i] = mergedIntervals.get(i);
        }
        return returnValue;
    }

    int[] mergeTwoIntervals(int[] interval1, int[] interval2) {
        int start1 = interval1[0];
        int end1 = interval1[1];
        int start2 = interval2[0];
        int end2 = interval2[1];

        if (start1 <= end2 && start2 <= end1) {
            return new int[] {Math.min(start1, start2), Math.max(end1, end2)};
        }
        else {
            return null;
        }
    }
}

package prasad.leetcode.p436;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRightInterval {

    public int[] findRightInterval(int[][] intervals) {
        int[] starts = new int[intervals.length];
        Map<Integer, Integer> startToIntervalIndexMap = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            startToIntervalIndexMap.put(starts[i], i);
        }
        Arrays.sort(starts);

        int[] rightIntervalIndices = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int end = intervals[i][1];
            boolean rightIntervalFound = false;
            for (int k = 0; k < starts.length; k++) {
                if (starts[k] >= end) {
                    rightIntervalIndices[i] = startToIntervalIndexMap.get(starts[k]);;
                    rightIntervalFound = true;
                    break;
                }
            }

            if (!rightIntervalFound) {
                rightIntervalIndices[i] = -1;
            }
        }
        return rightIntervalIndices;
    }
}

package prasad.leetcode.p1578;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTimeToMakeRopeColorful {

    public int minCost(String colors, int[] neededTime) {
        List<int[]> consecutiveRanges = findConsecutiveRanges(colors);

        int cost = 0;
        for (int[] range : consecutiveRanges) {
            int[] times = new int[range[1] - range[0] + 1];
            System.arraycopy(neededTime, range[0], times, 0, range[1] - range[0] + 1);
            Arrays.sort(times);
            for (int i = 0; i < times.length - 1; i++) { // excluding last item
                cost = cost + times[i];
            }
        }
        return cost;
    }

    List<int[]> findConsecutiveRanges(String colors) {
        List<int[]> ranges = new ArrayList<>();
        int start = -1;
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i - 1) == colors.charAt(i)) {
                if (start == -1) {
                    start = i - 1;
                }
            }
            else {
                if (start != -1) {
                    ranges.add(new int[] {start, i - 1});
                    start = -1;
                }
            }
        }

        // adding last range
        if (start != -1) {
            ranges.add(new int[] {start, colors.length() - 1});
        }
        return ranges;
    }
}

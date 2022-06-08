package prasad.leetcode.p2279;

import java.util.Arrays;

public class MaximumBagsWithFullCapacity {

    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(diff);
        int filled = 0;
        for (int i = 0; i < n; i++) {
            filled += diff[i];
            if (filled > additionalRocks) {
                return i;
            }
        }
        return n;
    }
}

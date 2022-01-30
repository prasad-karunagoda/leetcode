package prasad.leetcode.p1338;

import java.util.Arrays;

public class ReduceArraySizeToHalf {

    public int minSetSize(int[] arr) {
        int[] counts = new int[100001];
        for (int n : arr) {
            counts[n]++;
        }
        Arrays.sort(counts);

        int nextIndexToRemove = counts.length - 1;
        int removed = 0;
        while (removed < arr.length / 2) {
            removed = removed + counts[nextIndexToRemove];
            nextIndexToRemove--;
        }
        return counts.length - 1 - nextIndexToRemove;
    }
}

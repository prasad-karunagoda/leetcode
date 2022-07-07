package prasad.leetcode.p1365;

import java.util.Arrays;

public class HowManyNumbersAreSmaller {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);

        // Since values range from 0 to 100
        int[] map = new int[101];
        Arrays.fill(map, -1);

        for (int i = 0; i < sorted.length; i++) {
            if (map[sorted[i]] == -1) {
                map[sorted[i]] = i;
            }
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map[nums[i]];
        }
        return result;
    }

    // Brute force algorithm is slow for large input size.
    // For input size 50,000 -> around 6 seconds (other algorithm only takes around 20 milliseconds.)
    public int[] smallerNumbersThanCurrentBruteForce(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int n : nums) {
                if (n < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}

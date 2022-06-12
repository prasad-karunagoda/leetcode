package prasad.leetcode.p1877;

import java.util.Arrays;

public class MinimizeMaximumPairSum {

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            int pairSum = nums[i] + nums[nums.length - 1 - i];
            if (pairSum > max) {
                max = pairSum;
            }
        }
        return max;
    }
}

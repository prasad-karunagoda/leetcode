package prasad.leetcode.p1679;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int operationCount = 0;
        int endIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i >= endIndex) {
                break;
            }

            for (int j = endIndex; j > i; j--) {
                if (nums[i] + nums[j] == k) {
                    operationCount++;
                    endIndex = j - 1;
                    break;
                }
                else if (nums[i] + nums[j] < k) {
                    break;
                }
            }
        }
        return operationCount;
    }
}

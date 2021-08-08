package prasad.leetcode.p53;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxSumOfPrevious = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maxSumOfPrevious < 0) {
                maxSumOfPrevious = nums[i];
            }
            else {
                maxSumOfPrevious = maxSumOfPrevious + nums[i];
            }

            maxSum = Math.max(maxSum, maxSumOfPrevious);
        }
        return maxSum;
    }
}

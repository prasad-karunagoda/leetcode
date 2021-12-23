package prasad.leetcode.p643;

public class MaximumAverageSubarray1 {

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        double maxSum = sum;

        for (int startIndex = 1; startIndex <= nums.length - k; startIndex++) {
            sum = sum - nums[startIndex - 1] + nums[startIndex + k - 1];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum / k;
    }
}

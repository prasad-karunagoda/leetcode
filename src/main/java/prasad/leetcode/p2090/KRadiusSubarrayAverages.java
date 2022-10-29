package prasad.leetcode.p2090;

import java.util.Arrays;

public class KRadiusSubarrayAverages {

    public int[] getAverages(int[] nums, int k) {
        int[] averages = new int[nums.length];
        int subarrayLength = (k * 2) + 1;
        if (nums.length < subarrayLength) {
            Arrays.fill(averages, -1);
            return averages;
        }

        for (int i = 0; i < k; i++) {
            averages[i] = -1;
        }
        for (int i = nums.length - k; i < nums.length; i++) {
            averages[i] = -1;
        }

        long sum = 0;
        for (int i = 0; i < subarrayLength; i++) {
            sum += nums[i];
        }
        averages[k] = (int) (sum / subarrayLength);
        for (int centerIndex = k + 1; centerIndex < nums.length - k; centerIndex++) {
            sum = sum - nums[centerIndex - k - 1] + nums[centerIndex + k];
            averages[centerIndex] = (int) (sum / subarrayLength);
        }
        return averages;
    }

    public int[] getAverages_Slow(int[] nums, int k) {
        int[] averages = new int[nums.length];
        int subarrayLength = (k * 2) + 1;
        if (nums.length < subarrayLength) {
            Arrays.fill(averages, -1);
            return averages;
        }

        for (int i = 0; i < k; i++) {
            averages[i] = -1;
        }
        for (int i = nums.length - k; i < nums.length; i++) {
            averages[i] = -1;
        }

        for (int centerIndex = k; centerIndex < nums.length - k; centerIndex++) {
            long sum = 0;
            for (int i = centerIndex - k; i <= centerIndex + k; i++) {
                sum += nums[i];
            }
            averages[centerIndex] = (int) (sum / subarrayLength);
        }
        return averages;
    }
}

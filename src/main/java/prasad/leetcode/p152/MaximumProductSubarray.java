package prasad.leetcode.p152;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int product = nums[i];
            if (product > max) {
                max = product;
            }

            for (int j = i + 1; j < nums.length; j++) {
                product = product * nums[j];
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }
}

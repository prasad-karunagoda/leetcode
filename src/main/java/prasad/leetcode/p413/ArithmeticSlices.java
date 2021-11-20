package prasad.leetcode.p413;

public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        for (int start = 0; start < nums.length - 2; start++) {
            for (int end = start + 2; end < nums.length; end++) {
                if (isArithmetic(nums, start, end)) {
                    count++;
                }
            }
        }
        return count;
    }

    boolean isArithmetic(int[] nums, int start, int end) {
        int difference = nums[start + 1] - nums[start];
        for (int i = start + 1; i < end; i++) {
            if (nums[i + 1] - nums[i] != difference) {
                return false;
            }
        }
        return true;
    }
}

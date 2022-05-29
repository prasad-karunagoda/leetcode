package prasad.leetcode.p2221;

public class FindTriangularSumOfArray {

    public int triangularSum(int[] nums) {
        for (int lastIndex = nums.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i <= lastIndex - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }
        return nums[0];
    }
}

package prasad.leetcode.p215;

import java.util.Arrays;

public class KthLargestElementInArray {

    public int findKthLargest(int[] nums, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("k must be greater than 0.");
        }
        if (k > nums.length) {
            throw new IllegalArgumentException("k is greater than the length of the array.");
        }

        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

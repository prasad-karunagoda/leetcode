package prasad.leetcode.p35;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("nums array is empty.");
        }

        if (nums[0] > target) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        int distanceFromStart = target - nums[0];
        int distanceFromEnd = nums[nums.length - 1] - target;
        if (distanceFromStart < distanceFromEnd) { // Forward search
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= target) {
                    return i;
                }
            }
        }
        else { // Backward search
            for (int i = nums.length - 1; i >=0; i--) {
                if (nums[i] == target) {
                    return i;
                }
                else if (nums[i] < target) {
                    return i + 1;
                }
            }
        }
        throw new IllegalStateException("Execution must not reach here.");
    }
}

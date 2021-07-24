package prasad.leetcode.p34;

public class FindFirstAndLastPosition {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target) {
            return new int[] {-1, -1};
        }

        int distanceFromStart = target - nums[0];
        int distanceFromEnd = nums[nums.length - 1] - target;

        int rangeStart = -1;
        int rangeEnd = -1;
        if (distanceFromStart < distanceFromEnd) { // Forward search
            boolean rangeStartFound = false;
            for (int i = 0; i < nums.length; i++) {
                if (rangeStartFound) {
                    if (nums[i] == target) {
                        rangeEnd = i;
                    }
                    else {
                        break;
                    }
                }
                else {
                    if (nums[i] == target) {
                        rangeStart = i;
                        rangeEnd = i;
                        rangeStartFound = true;
                    }
                    else if (nums[i] > target) {
                        break;
                    }
                }
            }
        }
        else { // Backward search
            boolean rangeEndFound = false;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (rangeEndFound) {
                    if (nums[i] == target) {
                        rangeStart = i;
                    }
                    else {
                        break;
                    }
                }
                else {
                    if (nums[i] == target) {
                        rangeStart = i;
                        rangeEnd = i;
                        rangeEndFound = true;
                    }
                    else if (nums[i] < target) {
                        break;
                    }
                }
            }
        }

        return new int[] {rangeStart, rangeEnd};
    }
}

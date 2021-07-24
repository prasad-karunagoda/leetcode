package prasad.leetcode.p33;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int index = 0;
        boolean forward = nums[0] < target;
        while (true) {
            if (nums[index] == target) {
                return index;
            }
            else if (forward) {
                int nextIndex = index + 1;
                if (index == nums.length - 1 || nums[index] > nums[nextIndex]) {
                    return -1;
                }
                index = nextIndex;
            }
            else {
                if (index == 0) {
                    int nextIndex = nums.length - 1;
                    if (nums.length == 1 || nums[index] < nums[nextIndex]) {
                        return -1;
                    }
                    index = nextIndex;
                }
                else {
                    int nextIndex = index - 1;
                    if (nums[index] < nums[nextIndex]) {
                        return -1;
                    }
                    index = nextIndex;
                }
            }
        }
    }
}

package prasad.leetcode.p704;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (nums[middleIndex] > target) {
                endIndex = middleIndex - 1;
            }
            else if (nums[middleIndex] < target) {
                startIndex = middleIndex + 1;
            }
            else {
                return middleIndex;
            }
        }
        return -1;
    }
}

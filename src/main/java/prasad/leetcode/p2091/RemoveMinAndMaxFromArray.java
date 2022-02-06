package prasad.leetcode.p2091;

public class RemoveMinAndMaxFromArray {

    public int minimumDeletions(int[] nums) {
        int min = 100001;
        int max = -100001;
        int minIndex = -1;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        int removeFromFront;
        int removeFromBack;
        int removeFromBothSides;
        if (minIndex < maxIndex) {
            removeFromFront = maxIndex + 1;
            removeFromBack = nums.length - minIndex;
            removeFromBothSides = (minIndex + 1) + (nums.length - maxIndex);
        }
        else if (minIndex > maxIndex) {
            removeFromFront = minIndex + 1;
            removeFromBack = nums.length - maxIndex;
            removeFromBothSides = (maxIndex + 1) + (nums.length - minIndex);
        }
        else {
            // minIndex == maxIndex only when nums.length == 1 because values in nums are distinct.
            return 1;
        }

        return Math.min(Math.min(removeFromFront, removeFromBack), removeFromBothSides);
    }
}

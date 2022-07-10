package prasad.leetcode.p2294;

import java.util.Arrays;

public class PartitionArrayWithMaximumDifference {

    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0];
        int partitionCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min + k) {
                partitionCount++;
                min = nums[i];
            }
        }
        return partitionCount;
    }
}

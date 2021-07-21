package prasad.leetcode.p80;

public class RemoveDuplicatesFromSortedArray2 {

    public int removeDuplicates(int[] nums) {
        int previousNum = nums[0];
        int count = 1;
        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == previousNum) {
                count++;
            }
            else {
                count = 1;
            }

            if (count <= 2) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
            previousNum = nums[i];
        }
        return insertIndex;
    }
}

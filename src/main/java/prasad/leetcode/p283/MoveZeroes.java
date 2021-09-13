package prasad.leetcode.p283;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int insertionIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertionIndex] = nums[i];
                insertionIndex++;
            }
        }

        for (int i = insertionIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

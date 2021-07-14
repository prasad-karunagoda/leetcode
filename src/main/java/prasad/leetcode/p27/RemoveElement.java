package prasad.leetcode.p27;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int nextInsertIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[nextInsertIndex] = nums[i];
                nextInsertIndex++;
            }
        }
        return nextInsertIndex;
    }
}

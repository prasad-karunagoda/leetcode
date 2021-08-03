package prasad.leetcode.p55;

public class JumpGame {

    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + nums[i] >= nums.length - 1) {
                return true;
            }
            reach = Math.max(reach, i + nums[i]);
            if (reach < i + 1) {
                return false;
            }
        }
        return true;
    }
}

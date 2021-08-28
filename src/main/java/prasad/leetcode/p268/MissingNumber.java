package prasad.leetcode.p268;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        boolean[] found = new boolean[nums.length + 1];
        for (int n : nums) {
            found[n] = true;
        }
        for (int i = 0; i < found.length; i++) {
            if (!found[i]) {
                return i;
            }
        }
        throw new IllegalStateException("Execution is not expected to reach here.");
    }
}

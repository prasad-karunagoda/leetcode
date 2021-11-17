package prasad.leetcode.p485;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int n : nums) {
            if (n == 1) {
                current++;
                if (max < current) {
                    max = current;
                }
            }
            else {
                current = 0;
            }
        }
        return max;
    }
}

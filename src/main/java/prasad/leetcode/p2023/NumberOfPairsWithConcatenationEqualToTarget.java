package prasad.leetcode.p2023;

public class NumberOfPairsWithConcatenationEqualToTarget {

    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && target.equals(nums[i] + nums[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}

package prasad.leetcode.p303;

public class RangeSumQueryImmutable {

    private final int[] nums;

    public RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}

package prasad.leetcode.p1685;

public class SumOfAbsoluteDiff {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] diff = new int[nums.length - 1];
        int sum = 0;
        for (int i = 0; i < diff.length; i++) {
            diff[i] = nums[i + 1] - nums[0];
            sum += diff[i];
        }

        int[] result = new int[nums.length];
        result[0] = sum;
        for (int i = 0; i < diff.length; i++) {
            int change = i == 0 ? diff[0] : diff[i] - diff[i - 1];
            sum += change * i;
            sum -= change * (diff.length - 1 - i);
            result[i + 1] = sum;
        }
        return result;
    }
}

package prasad.leetcode.p1664;

public class WaysToMakeFairArray {

    public int waysToMakeFair(int[] nums) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i < nums.length; i++) {
            // Since first element is skipped, even index value is added to oddSum.
            if (i % 2 == 0) {
                oddSum += nums[i];
            }
            else {
                evenSum += nums[i];
            }
        }

        int count = evenSum == oddSum ? 1 : 0;

        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0) {
                oddSum = oddSum + nums[i - 1] - nums[i];
            }
            else {
                evenSum = evenSum + nums[i - 1] - nums[i];
            }

            if (evenSum == oddSum) {
                count++;
            }
        }
        return count;
    }
}

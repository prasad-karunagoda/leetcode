package prasad.leetcode.p396;

import java.util.Arrays;

public class RotateFunction {

    /*
     * E.g. nums = {43, 35, 27, 62}
     *
     * F(0) = 0*43 + 1*35 + 2*27 + 3*62
     *        ------------------
     * F(1) = 0*62 + 1*43 + 2*35 + 3*27
     *               ------------------
     * In F(1), (43+35+27) is added to F(0) [see underlined terms]. This is the increaseInFirstNMinusOneTerms in the code.
     * In F(1), 3*62 is removed from F(0). This is the lastTermOfPreviousSum in the code.
     *
     * This transition is there in each F(x) to F(x+1).
     */
    public int maxRotateFunction(int[] nums) {
        int k0Value = 0;
        for (int i = 1; i < nums.length; i++) {
            k0Value = k0Value + (i * nums[i]);
        }

        int sum = Arrays.stream(nums).sum();

        int functionValue = k0Value;
        int maxFunctionValue = functionValue;
        for (int k = 1; k < nums.length; k++) {
            int lastTermOfPreviousSum = (nums.length - 1) * nums[nums.length - k];
            int increaseInFirstNMinusOneTerms = sum - nums[nums.length - k];
            functionValue = functionValue - lastTermOfPreviousSum + increaseInFirstNMinusOneTerms;
            if (maxFunctionValue < functionValue) {
                maxFunctionValue = functionValue;
            }
        }
        return maxFunctionValue;
    }

    public int maxRotateFunctionTooSlow(int[] nums) {
        int maxFunctionValue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int[] rotated = rotate(nums, i);
            int functionValue = 0;
            for (int j = 0; j < rotated.length; j++) {
                functionValue = functionValue + (j * rotated[j]);
            }

            if (maxFunctionValue < functionValue) {
                maxFunctionValue = functionValue;
            }
        }
        return maxFunctionValue;
    }

    int[] rotate(int[] nums, int rotateBy) {
        int[] rotated = new int[nums.length];
        System.arraycopy(nums, nums.length - rotateBy, rotated, 0, rotateBy);
        System.arraycopy(nums, 0, rotated, rotateBy, nums.length - rotateBy);
        return rotated;
    }
}

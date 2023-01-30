package prasad.leetcode.p2206;

public class DivideArrayIntoEqualPairs {

    public boolean divideArray(int[] nums) {
        short[] counts = new short[501];
        for (int n : nums) {
            counts[n]++;
        }

        for (short c : counts) {
            if (c % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}

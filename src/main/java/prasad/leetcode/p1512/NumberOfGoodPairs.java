package prasad.leetcode.p1512;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int[] counts = new int[101];
        for (int n : nums) {
            counts[n]++;
        }

        int pairs = 0;
        for (int c : counts) {
            if (c > 1) {
                pairs += triangularNumber(c - 1);
            }
        }
        return pairs;
    }

    private int triangularNumber(int num) {
        return (num * (num + 1)) / 2;
    }
}

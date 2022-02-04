package prasad.leetcode.p1464;

public class MaxProductOfTwoElementsInArray {

    public int maxProduct(int[] nums) {
        int max = 0;
        int secondMax = 0;
        for (int n : nums) {
            if (n > max) {
                secondMax = max;
                max = n;
            }
            else if (n > secondMax) {
                secondMax = n;
            }
        }
        return (max - 1) * (secondMax - 1);
    }
}

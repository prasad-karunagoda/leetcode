package prasad.leetcode.p1287;

public class ElementAppearingMoreThan25Percent {

    public int findSpecialInteger(int[] arr) {
        int expectedCount = arr.length / 4 + 1;
        int count = 1;
        int previous = -1;
        for (int n : arr) {
            if (n == previous) {
                count++;
            }
            else {
                count = 1;
            }

            if (count == expectedCount) {
                return n;
            }
            previous = n;
        }
        throw new IllegalArgumentException("No integer appears more than 25 percent.");
    }
}

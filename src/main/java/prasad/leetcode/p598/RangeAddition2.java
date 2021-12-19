package prasad.leetcode.p598;

public class RangeAddition2 {

    public int maxCount(int m, int n, int[][] ops) {
        int[] intersection = new int[] {m, n};
        for (int[] op : ops) {
            intersection = intersection(intersection, op);
        }
        return intersection[0] * intersection[1];
    }

    private int[] intersection(int[] a, int[] b) {
        return new int[] { Math.min(a[0], b[0]), Math.min(a[1], b[1]) };
    }
}

package prasad.leetcode.p1828;

public class QueriesOnNumberOfPoints {

    public int[] countPoints(int[][] points, int[][] queries) {
        int[] counts = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];
            for (int[] p : points) {
                double distance = Math.sqrt(((x - p[0]) * (x - p[0])) + ((y - p[1]) * (y - p[1])));
                if (distance <= r) {
                    counts[i]++;
                }
            }
        }
        return counts;
    }
}

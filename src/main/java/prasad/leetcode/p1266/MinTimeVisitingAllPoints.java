package prasad.leetcode.p1266;

public class MinTimeVisitingAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i <= points.length - 2; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];

            int x = Math.abs(x1 - x2);
            int y = Math.abs(y1 - y2);
            time += Math.max(x, y);
        }
        return time;
    }
}

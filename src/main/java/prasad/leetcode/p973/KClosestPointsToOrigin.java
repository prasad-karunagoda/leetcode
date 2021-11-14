package prasad.leetcode.p973;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int k) {
        List<PointWrapper> wrappers = new ArrayList<>();
        for (int[] p : points) {
            wrappers.add(new PointWrapper(p));
        }

        Collections.sort(wrappers);

        int[][] closestPoints = new int[k][2];
        for (int i = 0; i < k; i++) {
            closestPoints[i] = wrappers.get(i).getPoint();
        }
        return closestPoints;
    }

    private static class PointWrapper implements Comparable<PointWrapper> {
        private final int[] point;
        private final double distanceToOrigin;

        private PointWrapper(int[] point) {
            this.point = point;
            this.distanceToOrigin = Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));
        }

        @Override
        public int compareTo(PointWrapper otherPoint) {
            return Double.compare(this.distanceToOrigin, otherPoint.distanceToOrigin);
        }

        private int[] getPoint() {
            return point;
        }
    }
}

package prasad.leetcode.p1232;

public class CheckStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        int secondPointIndex = -1;
        for (int i = 1; i < coordinates.length; i++) {
            if (coordinates[0][0] != coordinates[i][0]) {
                secondPointIndex = i;
                break;
            }
        }
        if (secondPointIndex == -1) {
            // All points on same vertical line
            return true;
        }

        double x1 = coordinates[0][0];
        double y1 = coordinates[0][1];
        double x2 = coordinates[secondPointIndex][0];
        double y2 = coordinates[secondPointIndex][1];

        // y = mx + c
        double m = (y1 - y2) / (x1 - x2);
        double c = y1 - (x1 * m);

        for (int[] point : coordinates) {
            double x = point[0];
            double y = point[1];
            double delta = Math.abs(y - ((m * x) + c));
            if (delta > 0.000001) {
                return false;
            }
        }
        return true;
    }
}

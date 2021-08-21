package prasad.leetcode.p593;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidSquare {

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        // Some pair of points are the same
        if (Arrays.equals(p1, p2) || Arrays.equals(p1, p3) || Arrays.equals(p1, p4) ||
                Arrays.equals(p2, p3) || Arrays.equals(p2, p4) || Arrays.equals(p3, p4)) {
            return false;
        }

        return isStraightSquare(p1, p2, p3, p4) || isRotatedSquare(p1, p2, p3, p4);
    }

    private boolean isStraightSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

        List<int[]> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);

        points.sort((point1, point2) -> {
            if (point1[0] > point2[0]) {
                return 1;
            }
            else if (point1[0] < point2[0]) {
                return -1;
            }
            else {
                if (point1[1] > point2[1]) {
                    return 1;
                }
                else if (point1[1] < point2[1]) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

        int[] bottomLeft = points.get(0);
        int[] topLeft = points.get(1);
        int[] bottomRight = points.get(2);
        int[] topRight = points.get(3);

        return (bottomLeft[0] == topLeft[0] &&
                bottomRight[0] == topRight[0] &&
                bottomLeft[1] == bottomRight[1] &&
                topLeft[1] == topRight[1] &&
                bottomRight[0] - bottomLeft[0] == topLeft[1] - bottomLeft[1]);
    }

    private boolean isRotatedSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        //p1,p2  p3,p4
        int x12 = Math.abs(p1[0] - p2[0]);
        int y12 = Math.abs(p1[1] - p2[1]);

        int x34 = Math.abs(p3[0] - p4[0]);
        int y34 = Math.abs(p3[1] - p4[1]);

        //p1,p3  p2,p4
        int x13 = Math.abs(p1[0] - p3[0]);
        int y13 = Math.abs(p1[1] - p3[1]);

        int x24 = Math.abs(p2[0] - p4[0]);
        int y24 = Math.abs(p2[1] - p4[1]);

        //p1,p4  p2,p3
        int x14 = Math.abs(p1[0] - p4[0]);
        int y14 = Math.abs(p1[1] - p4[1]);

        int x23 = Math.abs(p2[0] - p3[0]);
        int y23 = Math.abs(p2[1] - p3[1]);

        if (x12 == x34 && y12 == y34) {
            if (x13 == x24 && y13 == y24) {
                return (x14 == y23 && x23 == y14);
            }
            else if (x14 == x23 && y14 == y23) {
                return (x13 == y24 && x24 == y13);
            }
            else {
                return false;
            }
        }
        else if (x13 == x24 && y13 == y24) {
            if (x14 == x23 && y14 == y23) {
                return (x12 == y34 && x34 == y12);
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}

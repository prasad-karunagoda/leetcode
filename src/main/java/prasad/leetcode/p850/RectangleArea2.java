package prasad.leetcode.p850;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class RectangleArea2 {

    public int rectangleArea(int[][] rectangles) {
        HashSet<Integer> xSet = new HashSet<>();
        HashSet<Integer> ySet = new HashSet<>();
        for (int[] rect : rectangles) {
            xSet.add(rect[0]);
            ySet.add(rect[1]);
            xSet.add(rect[2]);
            ySet.add(rect[3]);
        }

        ArrayList<Integer> xList = new ArrayList<>(xSet);
        ArrayList<Integer> yList = new ArrayList<>(ySet);
        Collections.sort(xList);
        Collections.sort(yList);
        long area = 0;
        for (int i = 0; i <= xList.size() - 2; i++) {
            for (int j = 0; j <= yList.size() - 2; j++) {
                int x1 = xList.get(i);
                int x2 = xList.get(i + 1);
                int y1 = yList.get(j);
                int y2 = yList.get(j + 1);

                for (int[] rect : rectangles) {
                    int rX1 = rect[0];
                    int rY1 = rect[1];
                    int rX2 = rect[2];
                    int rY2 = rect[3];
                    if (rX1 < x2 && rX2 > x1 && rY1 < y2 && rY2 > y1) { // If overlapping
                        long w = x2 - x1;
                        long h = y2 - y1;
                        area += w * h;
                        break;
                    }
                }
            }
        }
        return (int) (area % 1000000007);
    }
}
